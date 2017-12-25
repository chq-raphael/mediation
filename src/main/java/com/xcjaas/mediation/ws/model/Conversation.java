/**
  * Copyright 2017 bejson.com 
  */
package com.xcjaas.mediation.ws.model;

/**
 * Auto-generated: 2017-12-22 10:18:26
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Conversation {

    private long mid;
    private long rootId;

    private CreateDate createDate;
    private String id;
    private LastModifiedDate lastModifiedDate;
    private String categoryAlias;
    private String clientId;
    private String deviceId;
    private String ipAddress;
    private String source;
    private String weChatUserId;

    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    public long getRootId() {
        return rootId;
    }

    public void setRootId(long rootId) {
        this.rootId = rootId;
    }

    public void setCreateDate(CreateDate createDate) {
         this.createDate = createDate;
     }
     public CreateDate getCreateDate() {
         return createDate;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
         this.lastModifiedDate = lastModifiedDate;
     }
     public LastModifiedDate getLastModifiedDate() {
         return lastModifiedDate;
     }

    public void setCategoryAlias(String categoryAlias) {
         this.categoryAlias = categoryAlias;
     }
     public String getCategoryAlias() {
         return categoryAlias;
     }

    public void setClientId(String clientId) {
         this.clientId = clientId;
     }
     public String getClientId() {
         return clientId;
     }

    public void setDeviceId(String deviceId) {
         this.deviceId = deviceId;
     }
     public String getDeviceId() {
         return deviceId;
     }

    public void setIpAddress(String ipAddress) {
         this.ipAddress = ipAddress;
     }
     public String getIpAddress() {
         return ipAddress;
     }

    public void setSource(String source) {
         this.source = source;
     }
     public String getSource() {
         return source;
     }

    public void setWeChatUserId(String weChatUserId) {
         this.weChatUserId = weChatUserId;
     }
     public String getWeChatUserId() {
         return weChatUserId;
     }

}