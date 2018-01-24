package com.xcjaas.mediation.entity;

/**
 * Created by Administrator on 2018/1/12.
 */
public class User {
    private int userId;
    private String wx_id;
    private String userName;
    private String userSex;
    private String userBirth;
    private String userCardId;
    private String userJig;
    private String userTel;
    private String userMinz;
    private String userAddr;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userBirth='" + userBirth + '\'' +
                ", userCardId='" + userCardId + '\'' +
                ", userJig='" + userJig + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userMinz='" + userMinz + '\'' +
                ", userAddr='" + userAddr + '\'' +
                '}';
    }

    public String getWx_id() {
        return wx_id;
    }

    public void setWx_id(String wx_id) {
        this.wx_id = wx_id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserCardId() {
        return userCardId;
    }

    public void setUserCardId(String userCardId) {
        this.userCardId = userCardId;
    }

    public String getUserJig() {
        return userJig;
    }

    public void setUserJig(String userJig) {
        this.userJig = userJig;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserMinz() {
        return userMinz;
    }

    public void setUserMinz(String userMinz) {
        this.userMinz = userMinz;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }
}
