package com.example.ahmedetman.civocracydiscussions.presenter;

import com.example.ahmedetman.civocracydiscussions.apis.NetworkCallBack;
import com.example.ahmedetman.civocracydiscussions.model.Issue;
import com.example.ahmedetman.civocracydiscussions.model.IssuesDataSource;

import java.util.ArrayList;

/**
 * Created by Ahmed Etman on 7/12/2017.
 */

public class IssuesPresenter implements IssuesContract.Presenter
{

    IssuesDataSource issuesDataSource;
    IssuesContract.View issuesView;
    public IssuesPresenter(IssuesDataSource issuesDataSource, IssuesContract.View view)
    {
        this.issuesView = view;
        this.issuesDataSource = issuesDataSource;
    }


    @Override
    public void loadIssuesList()
    {
        issuesDataSource.getIssuesList(new NetworkCallBack<ArrayList<Issue>>()
        {
            @Override
            public void onSuccess(ArrayList<Issue> data)
            {
                issuesView.showIssuesList(data);
            }

            @Override
            public void onFail(String errorMsg)
            {

            }
        });

    }
}
