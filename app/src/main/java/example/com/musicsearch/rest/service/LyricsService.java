package example.com.musicsearch.rest.service;

import java.util.Map;

import example.com.musicsearch.rest.model.LyricsModel;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by alamatounkara on 8/31/15.
 */
public interface LyricsService {

    //using the GET method
    @GET("/api.php")

    /**
     * @param songDetails is a map of key(param name in query string)-value(corresponding
     *                    param name's value in query string).
     * we are using a QueryMap cuz our url look something like this :
     * http://lyrics.wikia.com/api.php?func=getSong&artist=Tom+Waits&song=new+coat+of+paint&fmt=json
     *
     * @param lyricsResponse is POJO class that will have our json data
     */
    public void getLyric(@QueryMap(encodeValues=true) Map<String, String> songDetails, Callback<LyricsModel> lyricsResponse);

}
