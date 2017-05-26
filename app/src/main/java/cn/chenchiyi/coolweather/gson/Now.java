package cn.chenchiyi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ccy820 on 2017/5/23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
