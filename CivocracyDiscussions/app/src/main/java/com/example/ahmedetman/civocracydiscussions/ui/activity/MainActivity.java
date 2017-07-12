package com.example.ahmedetman.civocracydiscussions.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ahmedetman.civocracydiscussions.R;
import com.example.ahmedetman.civocracydiscussions.model.Issue;
import com.example.ahmedetman.civocracydiscussions.model.IssuesDataSource;
import com.example.ahmedetman.civocracydiscussions.presenter.IssuesContract;
import com.example.ahmedetman.civocracydiscussions.presenter.IssuesPresenter;
import com.example.ahmedetman.civocracydiscussions.ui.adapter.IssueListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IssuesContract.View
{

    IssuesPresenter issuesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        issuesPresenter = new IssuesPresenter(new IssuesDataSource(),this);
    }

    @Override
    protected void onStart()
    {
        super.onStart();

        issuesPresenter.loadIssuesList();
    }

    RecyclerView Re;
    @Override
    public void showIssuesList(ArrayList<Issue> issues)
    {
        IssueListAdapter issueListAdapter = new IssueListAdapter(issues, MainActivity.this);
        Re = (RecyclerView) findViewById(R.id.issues_recycler_view);
        Re.setLayoutManager(new LinearLayoutManager(this));
        Re.setAdapter(issueListAdapter);
    }
}
