
package com.example.ahmedetman.civocracydiscussions.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("notifBadges")
    @Expose
    private Integer notifBadges;
    @SerializedName("notifComment")
    @Expose
    private Integer notifComment;
    @SerializedName("notifIssue")
    @Expose
    private Integer notifIssue;
    @SerializedName("notifPropositions")
    @Expose
    private Integer notifPropositions;
    @SerializedName("notifResponse")
    @Expose
    private Integer notifResponse;
    @SerializedName("tutorialStep")
    @Expose
    private Integer tutorialStep;
    @SerializedName("roles")
    @Expose
    private List<Object> roles = null;
    @SerializedName("dateRegister")
    @Expose
    private String dateRegister;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Integer getNotifBadges() {
        return notifBadges;
    }

    public void setNotifBadges(Integer notifBadges) {
        this.notifBadges = notifBadges;
    }

    public Integer getNotifComment() {
        return notifComment;
    }

    public void setNotifComment(Integer notifComment) {
        this.notifComment = notifComment;
    }

    public Integer getNotifIssue() {
        return notifIssue;
    }

    public void setNotifIssue(Integer notifIssue) {
        this.notifIssue = notifIssue;
    }

    public Integer getNotifPropositions() {
        return notifPropositions;
    }

    public void setNotifPropositions(Integer notifPropositions) {
        this.notifPropositions = notifPropositions;
    }

    public Integer getNotifResponse() {
        return notifResponse;
    }

    public void setNotifResponse(Integer notifResponse) {
        this.notifResponse = notifResponse;
    }

    public Integer getTutorialStep() {
        return tutorialStep;
    }

    public void setTutorialStep(Integer tutorialStep) {
        this.tutorialStep = tutorialStep;
    }

    public List<Object> getRoles() {
        return roles;
    }

    public void setRoles(List<Object> roles) {
        this.roles = roles;
    }

    public String getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(String dateRegister) {
        this.dateRegister = dateRegister;
    }

}
