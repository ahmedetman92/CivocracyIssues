package com.example.ahmedetman.civocracydiscussions.apis;

import com.example.ahmedetman.civocracydiscussions.model.IssuesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ahmed Etman on 7/12/2017.
 */

public interface ApiInterface
{
    @GET("api/issues")
    Call<IssuesResponse> getTIssues(@Query("filters[community]")String  community,
                                    @Query("filters[official]") int official,
                                    @Query("order_by[date]")String order);
}
