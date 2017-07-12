package com.example.ahmedetman.civocracydiscussions.apis;

/**
 * Created by Ahmed Etman on 7/12/2017.
 */

public interface NetworkCallBack<T>
{

    void onSuccess(T data);

    void onFail(String errorMsg);
}
