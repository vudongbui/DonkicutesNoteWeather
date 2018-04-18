package com.example.owner.donkicutesnoteweather;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Owner on 4/19/2018.
 */

public interface WeatherService {
    @GET("weather")
    Call<WeatherReq> getInfWeather(@Query("q") String name, @Query("APPID") String appID);
}
