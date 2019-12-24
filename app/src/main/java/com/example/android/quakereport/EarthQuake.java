package com.example.android.quakereport;

public class EarthQuake {
    /**
     * intensity opf the earthquake
     */
    private String mIntensity;
    /**
     * url link to the earthquake
     */
    private String mUrl;

    /**
     * town where the earthquake occured
     */
    private String mTown;
    /**
     * date of Earthquake occurence
     */
    private String mDate;

    /**
     * Create a new Info object.
     *
     * @param intensity is the name of a particular hotel, restaurant etc
     * @param town      is the relative location of the target named place
     * @param date      is the relative location of the target named place
     */
    public EarthQuake(String intensity, String town, String date,String url) {
        mIntensity = intensity;
        mTown = town;
        mDate = date;
        mUrl  = url;
    }

    /**
     * Get the name of the place
     */
    public String getIntensity() {
        return mIntensity;
    }

    /**
     * Get the location of the place.
     */
    public String getTown() {
        return mTown;
    }

    /**
     * Get the location of the place.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Get the location of the place.
     */
    public String getUrl() {
        return mUrl;
    }
}

