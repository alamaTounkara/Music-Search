package example.com.musicsearch.rest.model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * This POJO/Model class will contain all the Json data that I am going to get from the
 * server(Itune REST API).
 * Created by alamatounkara on 8/31/15.
 */
public class ItuneModel {

    @Expose
    private Integer resultCount;
    @Expose
    private List<Result> results = new ArrayList<Result>();

    /**
     *
     * @return
     * The resultCount
     */
    public Integer getResultCount() {
        return resultCount;
    }

    /**
     *
     * @param resultCount
     * The resultCount
     */
    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    /**
     *
     * @return
     * The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

}
