package com.xcjaas.mediation.entity;

import java.util.Date;

/**
 * Created by wallaw on 2017/12/19.
 */
public class Conversation {
    private String categoryAlias;
    private String clientId;
    private Date createDate;
    private String deviceId;
    private String id;
    private String ipAddress;
    private String lastModifiedDate;
    private String source;
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
