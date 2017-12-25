/**
  * Copyright 2017 bejson.com 
  */
package com.xcjaas.mediation.ws.model;
import java.util.List;

/**
 * Auto-generated: 2017-12-22 10:18:26
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    private long id;
    private String clientTexts;
    private String texts;

    private String calculateResult;
    private List<String> clientText;
    private Conversation conversation;
    private String errorMsg;
    private String leaf;
    private List<String> legalCases;
    private String mediators;
    private String needMediators;
    private List<Nodes> nodes;
    private String onClose;
    private String predictionResult;
    private String remoteInfo;
    private List<String> text;
    private String completeServerText;

    private String legalCasess;

    public String getLegalCasess() {
        if (legalCases != null && legalCases.size()>0){
            StringBuffer stringBuffer = new StringBuffer();
            for (String str:legalCases){
                stringBuffer.append(str+"|");
            }
            legalCasess = stringBuffer.toString();
        }

        return legalCasess;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClientTexts() {
        if (clientText != null && clientText.size()>0){
            StringBuffer stringBuffer = new StringBuffer();
            for (String str:clientText){
                stringBuffer.append(str+"|");
            }
            clientTexts = stringBuffer.toString();
        }
        return clientTexts;
    }

    public void setClientTexts(String clientTexts) {
        this.clientTexts = clientTexts;
    }

    public String getTexts() {
        if (text != null && text.size()>0){
            StringBuffer stringBuffer = new StringBuffer();
            for (String str:text){
                stringBuffer.append(str+"|");
            }
            texts = stringBuffer.toString();
        }
        return texts;
    }

    public void setTexts(String texts) {
        this.texts = texts;
    }

    public void setCalculateResult(String calculateResult) {
         this.calculateResult = calculateResult;
     }
     public String getCalculateResult() {
         return calculateResult;
     }

    public void setClientText(List<String> clientText) {
         this.clientText = clientText;
     }
     public List<String> getClientText() {
         return clientText;
     }

    public void setConversation(Conversation conversation) {
         this.conversation = conversation;
     }
     public Conversation getConversation() {
         return conversation;
     }

    public void setErrorMsg(String errorMsg) {
         this.errorMsg = errorMsg;
     }
     public String getErrorMsg() {
         return errorMsg;
     }

    public void setLeaf(String leaf) {
         this.leaf = leaf;
     }
     public String getLeaf() {
         return leaf;
     }

    public void setLegalCases(List<String> legalCases) {
         this.legalCases = legalCases;
     }
     public List<String> getLegalCases() {
         return legalCases;
     }

    public void setMediators(String mediators) {
         this.mediators = mediators;
     }
     public String getMediators() {
         return mediators;
     }

    public void setNeedMediators(String needMediators) {
         this.needMediators = needMediators;
     }
     public String getNeedMediators() {
         return needMediators;
     }

    public void setNodes(List<Nodes> nodes) {
         this.nodes = nodes;
     }
     public List<Nodes> getNodes() {
         return nodes;
     }

    public void setOnClose(String onClose) {
         this.onClose = onClose;
     }
     public String getOnClose() {
         return onClose;
     }

    public void setPredictionResult(String predictionResult) {
         this.predictionResult = predictionResult;
     }
     public String getPredictionResult() {
         return predictionResult;
     }

    public void setRemoteInfo(String remoteInfo) {
         this.remoteInfo = remoteInfo;
     }
     public String getRemoteInfo() {
         return remoteInfo;
     }

    public void setText(List<String> text) {
         this.text = text;
     }
     public List<String> getText() {
         return text;
     }

    public void setCompleteServerText(String completeServerText) {
         this.completeServerText = completeServerText;
     }
     public String getCompleteServerText() {
         return completeServerText;
     }

}