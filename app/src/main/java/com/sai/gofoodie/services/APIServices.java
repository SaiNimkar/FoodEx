package com.sai.gofoodie.services;

import com.sai.gofoodie.model.FoodDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIServices {
    @GET("/food")
    Call<List<FoodDetails>> getFoodData();
}
