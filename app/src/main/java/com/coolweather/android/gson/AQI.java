package com.coolweather.android.gson;

/**
 * Created by apple on 2018/2/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
