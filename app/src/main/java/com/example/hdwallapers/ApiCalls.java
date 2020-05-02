package com.example.hdwallapers;

import java.lang.annotation.Target;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiCalls {

    @Headers("Content-Type: application/json")
    @GET("get.php")
    Call<Photos> getphotos_viewby
            (@Query("auth") String auth,
             @Query("method") String method,
             @Query("page") int page,
             @Query("info_level")int info_level);

    @Headers("Content-Type: application/json")
    @GET("get.php")
    Call<Photos> getNewPhotos(@Query("auth")String auth,
                              @Query("method") String method,
                              @Query("page") int page,
                              @Query("info_level")int info_level);



}

