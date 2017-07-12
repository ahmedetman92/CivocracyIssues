package com.example.ahmedetman.civocracydiscussions.presenter;

import com.example.ahmedetman.civocracydiscussions.model.Issue;

import java.util.ArrayList;

/**
 * Created by Ahmed Etman on 7/12/2017.
 */

public interface IssuesContract
{

    interface Presenter
    {
        void loadIssuesList();
    }

    interface View
    {
        void showIssuesList(ArrayList<Issue> issues);
    }
}
