
package com.example.ahmedetman.civocracydiscussions.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IssuesResponse {

    @SerializedName("issues")
    @Expose
    private List<Issue> issues = null;
    @SerializedName("users")
    @Expose
    private List<User> users = null;
    @SerializedName("communities")
    @Expose
    private List<Community> communities = null;

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }

}
