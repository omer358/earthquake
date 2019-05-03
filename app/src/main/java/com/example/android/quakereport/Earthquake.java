package com.example.android.quakereport;

public class Earthquake {
    private double mMag;
    private String mPlace;
    private Long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double mag,String place, Long timeInMilliseconds,String url){
        mMag=mag;
        mPlace=place;
        mTimeInMilliseconds =timeInMilliseconds;
        mUrl=url;
    }
    public double getmMag(){
        return mMag;
    }
    public String getmPlace(){
        return mPlace;
    }
    public Long getmTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }
    public String getUrl(){
        return mUrl;
    }
}
