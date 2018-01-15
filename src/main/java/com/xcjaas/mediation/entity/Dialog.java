package com.xcjaas.mediation.entity;

import java.util.List;

/**
 * Created by wallaw on 2017/12/19.
 */
//会话体
public class Dialog {
    //预测结果
    private double calculateResult;
    //客户文本
    private List<String> clientText;
    //完整的服务器文本
    private String completeServerText;
    //会话类Conversation
    private Conversation conversation;
    //错误信息
    private String errorMsg;
    //页
    private String leaf;
    //合法案例
    private List<String> legalCases;
    //调解人
    private String mediators;
    //需要调解人
    private String needMediators;
    //节点集合类Node
    private List<Node> nodes;
    //关闭窗口
    private String onClose;
    //预测结果
    private String predictionResult;
    //延伸信息
    private String remoteInfo;
    //text集合
    private List<String> text;

    public double getCalculateResult() {
        return calculateResult;
    }

    public void setCalculateResult(double calculateResult) {
        this.calculateResult = calculateResult;
    }

    public List<String> getClientText() {
        return clientText;
    }

    public void setClientText(List<String> clientText) {
        this.clientText = clientText;
    }

    public String getCompleteServerText() {
        return completeServerText;
    }

    public void setCompleteServerText(String completeServerText) {
        this.completeServerText = completeServerText;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public List<String> getLegalCases() {
        return legalCases;
    }

    public void setLegalCases(List<String> legalCases) {
        this.legalCases = legalCases;
    }

    public String getMediators() {
        return mediators;
    }

    public void setMediators(String mediators) {
        this.mediators = mediators;
    }

    public String getNeedMediators() {
        return needMediators;
    }

    public void setNeedMediators(String needMediators) {
        this.needMediators = needMediators;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String getOnClose() {
        return onClose;
    }

    public void setOnClose(String onClose) {
        this.onClose = onClose;
    }

    public String getPredictionResult() {
        return predictionResult;
    }

    public void setPredictionResult(String predictionResult) {
        this.predictionResult = predictionResult;
    }

    public String getRemoteInfo() {
        return remoteInfo;
    }

    public void setRemoteInfo(String remoteInfo) {
        this.remoteInfo = remoteInfo;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }
}
