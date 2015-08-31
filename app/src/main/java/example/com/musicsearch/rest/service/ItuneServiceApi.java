package example.com.musicsearch.rest.service;

import example.com.musicsearch.rest.model.ItuneModel;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by alamatounkara on 8/31/15.
 */
public interface ItuneServiceApi {
    /**
     * using GET method to call the server where url is our base URL=> https://itunes.apple.com
     * and append it the service calling url starting with '/' and search term is based on the query
     * string that will be gotten from our edit text.
     * final url will look like => https://itunes.apple.com/search?term=someSearchTerm
     */

    @GET("/search")

    /**
     * getting the search term and send the responses to the POJO class
     * @paran terrm is the search term value passed to the edittext by the use such as: lil wayne
     * @paran response is the List of Json object from the server that is be passed to our
     * POJO class (ItuneModel). It also allows asynchronous call(defining a CallBack and return void)
     */
    public void searchTems(@Query("term") String searchTerm, Callback<ItuneModel> response);

}
