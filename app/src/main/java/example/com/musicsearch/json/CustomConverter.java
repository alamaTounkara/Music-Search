package example.com.musicsearch.json;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

import example.com.musicsearch.rest.model.LyricsModel;
import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

/**
 *
 * This api: http://lyrics.wikia.com/api.php?func=getSong&artist=Tom+Waits&song=new+coat+of+paint&fmt=json
 * gives us a non-Valid json file. Retrofit uses Gson as default, but because the json that we are
 * getting from the above api is not valid, we will have exception.
 * That's why We need this class to provide a custom converter for our Retrofit RestAdapter.
 * Created by alamatounkara on 8/31/15.
 */
public class CustomConverter  implements Converter {
    public static final String TAG = "CustomConverter";


    @Override
    public Object fromBody(TypedInput body, Type type) throws ConversionException {

        //Our POJO class that will contain the Json data
        LyricsModel lyricsModel = new LyricsModel();

        BufferedReader bufferedReader = null;
        StringBuffer lyricStringdata = null;
        JSONObject jsonObject = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(body.in()));
            lyricStringdata = new StringBuffer();
            String read;
            while ((read = bufferedReader.readLine()) != null) {
                lyricStringdata.append(read);
            }

            //we are getting a string object, such:  song={......}. that is an invalid json
            // we need to strip out the: {......} from the file and transform that into a json object
            // 'song=' will be taken out, which will leave us with our {......}
            jsonObject = new JSONObject(lyricStringdata.substring(lyricStringdata.indexOf("{"),
                    lyricStringdata.indexOf("}") + 1));

            //setting our POJO fields
            lyricsModel.setArtist(jsonObject.getString("artist"));
            lyricsModel.setSong(jsonObject.getString("song"));
            lyricsModel.setLyrics(jsonObject.getString("lyrics"));
            lyricsModel.setUrl(jsonObject.getString("url"));

        } catch (IOException e) {
            Log.d(TAG, "" + e + "\n");
            e.printStackTrace();
        } catch (JSONException e) {
            Log.d(TAG, "" + e + "\n");
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {//closing the bufferedReader
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return lyricsModel;
    }

    @Override
    public TypedOutput toBody(Object object) {
        return null;
    }
}
