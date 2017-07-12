package com.example.ahmedetman.civocracydiscussions.model;

import com.example.ahmedetman.civocracydiscussions.apis.ApiClient;
import com.example.ahmedetman.civocracydiscussions.apis.ApiInterface;
import com.example.ahmedetman.civocracydiscussions.apis.NetworkCallBack;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Ahmed Etman on 7/12/2017.
 */

public class IssuesDataSource
{

    ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
    public void getIssuesList(final NetworkCallBack networkCallBack)
    {
        apiInterface.getTIssues("384",1,"desc").enqueue(new Callback<IssuesResponse>()
        {
            @Override
            public void onResponse(Call<IssuesResponse> call, Response<IssuesResponse> response)
            {
                IssuesResponse issuesResponse = response.body();
                if(issuesResponse != null)
                {
                    networkCallBack.onSuccess(issuesResponse.getIssues());
                }
                else
                {
                    networkCallBack.onFail("parsing fail");
                }
            }

            @Override
            public void onFailure(Call<IssuesResponse> call, Throwable t)
            {
                networkCallBack.onFail(t.getMessage());
            }
        });
    }
}
