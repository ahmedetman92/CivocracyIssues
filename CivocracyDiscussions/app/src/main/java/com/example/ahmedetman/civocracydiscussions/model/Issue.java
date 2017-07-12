
package com.example.ahmedetman.civocracydiscussions.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Issue {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("tag")
    @Expose
    private String tag;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("outcome")
    @Expose
    private String outcome;
    @SerializedName("thanksMessage")
    @Expose
    private String thanksMessage;
    @SerializedName("emailNumber")
    @Expose
    private Integer emailNumber;
    @SerializedName("user")
    @Expose
    private Integer user;
    @SerializedName("official")
    @Expose
    private Boolean official;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("dateBegin")
    @Expose
    private String dateBegin;
    @SerializedName("dateEnd")
    @Expose
    private String dateEnd;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("community")
    @Expose
    private Integer community;
    @SerializedName("initiatorName")
    @Expose
    private String initiatorName;
    @SerializedName("initiatorSummary")
    @Expose
    private String initiatorSummary;
    @SerializedName("initiatorImage")
    @Expose
    private String initiatorImage;
    @SerializedName("propositions")
    @Expose
    private List<Object> propositions = null;
    @SerializedName("followersNumber")
    @Expose
    private Integer followersNumber;
    @SerializedName("communityInvited")
    @Expose
    private Boolean communityInvited;
    @SerializedName("reviewStatus")
    @Expose
    private String reviewStatus;
    @SerializedName("isCompleted")
    @Expose
    private Boolean isCompleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getThanksMessage() {
        return thanksMessage;
    }

    public void setThanksMessage(String thanksMessage) {
        this.thanksMessage = thanksMessage;
    }

    public Integer getEmailNumber() {
        return emailNumber;
    }

    public void setEmailNumber(Integer emailNumber) {
        this.emailNumber = emailNumber;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Boolean getOfficial() {
        return official;
    }

    public void setOfficial(Boolean official) {
        this.official = official;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(String dateBegin) {
        this.dateBegin = dateBegin;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        String url = "https://res-5.cloudinary.com/civocracy/image/upload/h_87,w_476,q_auto,f_auto,c_fill/" + image ;
        if(description.contains(".jpg"))
        {
           url += ".jpg";
        }
        else if(description.contains(".jpeg"))
        {
            url += ".jpeg";
        }
        return url;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Integer getCommunity() {
        return community;
    }

    public void setCommunity(Integer community) {
        this.community = community;
    }

    public String getInitiatorName() {
        return initiatorName;
    }

    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    public String getInitiatorSummary() {
        return initiatorSummary;
    }

    public void setInitiatorSummary(String initiatorSummary) {
        this.initiatorSummary = initiatorSummary;
    }

    public String getInitiatorImage() {
        return initiatorImage;
    }

    public void setInitiatorImage(String initiatorImage) {
        this.initiatorImage = initiatorImage;
    }

    public List<Object> getPropositions() {
        return propositions;
    }

    public void setPropositions(List<Object> propositions) {
        this.propositions = propositions;
    }

    public Integer getFollowersNumber() {
        return followersNumber;
    }

    public void setFollowersNumber(Integer followersNumber) {
        this.followersNumber = followersNumber;
    }

    public Boolean getCommunityInvited() {
        return communityInvited;
    }

    public void setCommunityInvited(Boolean communityInvited) {
        this.communityInvited = communityInvited;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

}
