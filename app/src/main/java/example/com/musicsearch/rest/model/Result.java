package example.com.musicsearch.rest.model;

import com.google.gson.annotations.Expose;

/**
 * Created by alamatounkara on 8/31/15.
 */
public class Result {
    @Expose
    private String wrapperType;
    @Expose
    private String kind;
    @Expose
    private Integer artistId;
    @Expose
    private Integer collectionId;
    @Expose
    private Integer trackId;
    @Expose
    private String artistName;
    @Expose
    private String collectionName;
    @Expose
    private String trackName;
    @Expose
    private String collectionCensoredName;
    @Expose
    private String trackCensoredName;
    @Expose
    private String artistViewUrl;
    @Expose
    private String collectionViewUrl;
    @Expose
    private String trackViewUrl;
    @Expose
    private String previewUrl;
    @Expose
    private String artworkUrl30;
    @Expose
    private String artworkUrl60;
    @Expose
    private String artworkUrl100;
    @Expose
    private Double collectionPrice;
    @Expose
    private Double trackPrice;
    @Expose
    private String releaseDate;
    @Expose
    private String collectionExplicitness;
    @Expose
    private String trackExplicitness;
    @Expose
    private Integer discCount;
    @Expose
    private Integer discNumber;
    @Expose
    private Integer trackCount;
    @Expose
    private Integer trackNumber;
    @Expose
    private Integer trackTimeMillis;
    @Expose
    private String country;
    @Expose
    private String currency;
    @Expose
    private String primaryGenreName;
    @Expose
    private String radioStationUrl;
    @Expose
    private Boolean isStreamable;
    @Expose
    private Double collectionHdPrice;
    @Expose
    private Double trackHdPrice;
    @Expose
    private String contentAdvisoryRating;
    @Expose
    private String longDescription;
    @Expose
    private Double trackRentalPrice;
    @Expose
    private Double trackHdRentalPrice;

    /**
     * @return The wrapperType
     */
    public String getWrapperType() {
        return wrapperType;
    }

    /**
     * @param wrapperType The wrapperType
     */
    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    /**
     * @return The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * @param kind The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * @return The artistId
     */
    public Integer getArtistId() {
        return artistId;
    }

    /**
     * @param artistId The artistId
     */
    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    /**
     * @return The collectionId
     */
    public Integer getCollectionId() {
        return collectionId;
    }

    /**
     * @param collectionId The collectionId
     */
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * @return The trackId
     */
    public Integer getTrackId() {
        return trackId;
    }

    /**
     * @param trackId The trackId
     */
    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    /**
     * @return The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * @param artistName The artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * @return The collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * @param collectionName The collectionName
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * @return The trackName
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     * @param trackName The trackName
     */
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    /**
     * @return The collectionCensoredName
     */
    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    /**
     * @param collectionCensoredName The collectionCensoredName
     */
    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    /**
     * @return The trackCensoredName
     */
    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    /**
     * @param trackCensoredName The trackCensoredName
     */
    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    /**
     * @return The artistViewUrl
     */
    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    /**
     * @param artistViewUrl The artistViewUrl
     */
    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    /**
     * @return The collectionViewUrl
     */
    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    /**
     * @param collectionViewUrl The collectionViewUrl
     */
    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    /**
     * @return The trackViewUrl
     */
    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    /**
     * @param trackViewUrl The trackViewUrl
     */
    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    /**
     * @return The previewUrl
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * @param previewUrl The previewUrl
     */
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    /**
     * @return The artworkUrl30
     */
    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    /**
     * @param artworkUrl30 The artworkUrl30
     */
    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    /**
     * @return The artworkUrl60
     */
    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    /**
     * @param artworkUrl60 The artworkUrl60
     */
    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    /**
     * @return The artworkUrl100
     */
    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    /**
     * @param artworkUrl100 The artworkUrl100
     */
    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    /**
     * @return The collectionPrice
     */
    public Double getCollectionPrice() {
        return collectionPrice;
    }

    /**
     * @param collectionPrice The collectionPrice
     */
    public void setCollectionPrice(Double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    /**
     * @return The trackPrice
     */
    public Double getTrackPrice() {
        return trackPrice;
    }

    /**
     * @param trackPrice The trackPrice
     */
    public void setTrackPrice(Double trackPrice) {
        this.trackPrice = trackPrice;
    }

    /**
     * @return The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate The releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return The collectionExplicitness
     */
    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    /**
     * @param collectionExplicitness The collectionExplicitness
     */
    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    /**
     * @return The trackExplicitness
     */
    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    /**
     * @param trackExplicitness The trackExplicitness
     */
    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    /**
     * @return The discCount
     */
    public Integer getDiscCount() {
        return discCount;
    }

    /**
     * @param discCount The discCount
     */
    public void setDiscCount(Integer discCount) {
        this.discCount = discCount;
    }

    /**
     * @return The discNumber
     */
    public Integer getDiscNumber() {
        return discNumber;
    }

    /**
     * @param discNumber The discNumber
     */
    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    /**
     * @return The trackCount
     */
    public Integer getTrackCount() {
        return trackCount;
    }

    /**
     * @param trackCount The trackCount
     */
    public void setTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
    }

    /**
     * @return The trackNumber
     */
    public Integer getTrackNumber() {
        return trackNumber;
    }

    /**
     * @param trackNumber The trackNumber
     */
    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    /**
     * @return The trackTimeMillis
     */
    public Integer getTrackTimeMillis() {
        return trackTimeMillis;
    }

    /**
     * @param trackTimeMillis The trackTimeMillis
     */
    public void setTrackTimeMillis(Integer trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    /**
     * @return The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return The primaryGenreName
     */
    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    /**
     * @param primaryGenreName The primaryGenreName
     */
    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    /**
     * @return The radioStationUrl
     */
    public String getRadioStationUrl() {
        return radioStationUrl;
    }

    /**
     * @param radioStationUrl The radioStationUrl
     */
    public void setRadioStationUrl(String radioStationUrl) {
        this.radioStationUrl = radioStationUrl;
    }

    /**
     * @return The isStreamable
     */
    public Boolean getIsStreamable() {
        return isStreamable;
    }

    /**
     * @param isStreamable The isStreamable
     */
    public void setIsStreamable(Boolean isStreamable) {
        this.isStreamable = isStreamable;
    }

    /**
     * @return The collectionHdPrice
     */
    public Double getCollectionHdPrice() {
        return collectionHdPrice;
    }

    /**
     * @param collectionHdPrice The collectionHdPrice
     */
    public void setCollectionHdPrice(Double collectionHdPrice) {
        this.collectionHdPrice = collectionHdPrice;
    }

    /**
     * @return The trackHdPrice
     */
    public Double getTrackHdPrice() {
        return trackHdPrice;
    }

    /**
     * @param trackHdPrice The trackHdPrice
     */
    public void setTrackHdPrice(Double trackHdPrice) {
        this.trackHdPrice = trackHdPrice;
    }

    /**
     * @return The contentAdvisoryRating
     */
    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    /**
     * @param contentAdvisoryRating The contentAdvisoryRating
     */
    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    /**
     * @return The longDescription
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * @param longDescription The longDescription
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * @return The trackRentalPrice
     */
    public Double getTrackRentalPrice() {
        return trackRentalPrice;
    }

    /**
     * @param trackRentalPrice The trackRentalPrice
     */
    public void setTrackRentalPrice(Double trackRentalPrice) {
        this.trackRentalPrice = trackRentalPrice;
    }

    /**
     * @return The trackHdRentalPrice
     */
    public Double getTrackHdRentalPrice() {
        return trackHdRentalPrice;
    }

    /**
     * @param trackHdRentalPrice The trackHdRentalPrice
     */
    public void setTrackHdRentalPrice(Double trackHdRentalPrice) {
        this.trackHdRentalPrice = trackHdRentalPrice;
    }

}