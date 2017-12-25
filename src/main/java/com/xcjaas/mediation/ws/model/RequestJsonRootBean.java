/**
  * Copyright 2017 bejson.com 
  */
package com.xcjaas.mediation.ws.model;

/**
 * Auto-generated: 2017-12-22 10:23:33
 * 请求对象
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class RequestJsonRootBean {

    private String messageRequestType;
    private String parentAlias;
    private String text;
    private String conversationId;
    private String board;
    private Param param;
    private String source;
    private Auth auth;
    public void setMessageRequestType(String messageRequestType) {
         this.messageRequestType = messageRequestType;
     }
     public String getMessageRequestType() {
         return messageRequestType;
     }

    public void setParentAlias(String parentAlias) {
         this.parentAlias = parentAlias;
     }
     public String getParentAlias() {
         return parentAlias;
     }

    public void setText(String text) {
         this.text = text;
     }
     public String getText() {
         return text;
     }

    public void setConversationId(String conversationId) {
         this.conversationId = conversationId;
     }
     public String getConversationId() {
         return conversationId;
     }

    public void setBoard(String board) {
         this.board = board;
     }
     public String getBoard() {
         return board;
     }

    public void setParam(Param param) {
         this.param = param;
     }
     public Param getParam() {
         return param;
     }

    public void setSource(String source) {
         this.source = source;
     }
     public String getSource() {
         return source;
     }

    public void setAuth(Auth auth) {
         this.auth = auth;
     }
     public Auth getAuth() {
         return auth;
     }

}