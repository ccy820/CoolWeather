package cn.chenchiyi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ccy820 on 2017/5/23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}