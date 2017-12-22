package com.xcjaas.mediation.entity;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wallaw on 2017/12/19.
 */
public class Dialog {
    private double calculateResult;
    private String[] clientText;
    private String completeServerText;
    private Conversation conversation;
    private String errorMsg;
    private String leaf;
    private String[] legalCases;
    private String mediators;
    private String needMediators;
    private List<Node> nodes;
    private String onClose;
    private String predictionResult;
    private String remoteInfo;
    private String[] text;

    public double getCalculateResult() {
        return calculateResult;
    }

    public void setCalculateResult(double calculateResult) {
        this.calculateResult = calculateResult;
    }

    public String[] getClientText() {
        return clientText;
    }

    public void setClientText(String[] clientText) {
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

    public String[] getLegalCases() {
        return legalCases;
    }

    public void setLegalCases(String[] legalCases) {
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

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Dialog{" +
                "calculateResult=" + calculateResult +
                ", clientText=" + Arrays.toString(clientText) +
                ", completeServerText='" + completeServerText + '\'' +
                ", conversation=" + conversation +
                ", errorMsg='" + errorMsg + '\'' +
                ", leaf='" + leaf + '\'' +
                ", legalCases=" + Arrays.toString(legalCases) +
                ", mediators='" + mediators + '\'' +
                ", needMediators='" + needMediators + '\'' +
                ", nodes=" + nodes +
                ", onClose='" + onClose + '\'' +
                ", predictionResult='" + predictionResult + '\'' +
                ", remoteInfo='" + remoteInfo + '\'' +
                ", text=" + Arrays.toString(text) +
                '}';
    }
}
