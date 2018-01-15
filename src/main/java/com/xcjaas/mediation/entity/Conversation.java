package com.xcjaas.mediation.entity;

import java.util.Date;

/**
 * Created by wallaw on 2017/12/19.
 */
//会话
public class Conversation {
    //分类别名
    private String categoryAlias;
    //客户端Id
    private String clientId;
    //创建日期
    private Date createDate;
    //设备Id
    private String deviceId;

    private String id;
    //ip地址
    private String ipAddress;
    //最新更新时间
    private String lastModifiedDate;
    //本源
    private String source;
    //微信用户Id
    private String weChatUserId;

    public String getCategoryAlias() {
        return categoryAlias;
    }

    public void setCategoryAlias(String categoryAlias) {
        this.categoryAlias = categoryAlias;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getWeChatUserId() {
        return weChatUserId;
    }

    public void setWeChatUserId(String weChatUserId) {
        this.weChatUserId = weChatUserId;
    }
}
