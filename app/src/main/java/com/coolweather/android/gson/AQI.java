package com.coolweather.android.gson;

/**
 * Created by family on 2017/3/25.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
