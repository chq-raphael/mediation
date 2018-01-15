package com.xcjaas.mediation.entity;

import java.util.List;

/**
 * Created by wallaw on 2017/12/19.
 */
//节点类
public class Node {
    //别名
    private String alias;
    //答案
    private List<String> answers;
    //选择的话语
    private String chooseSentence;
    //明文
    private String clearText;
    //可以点击的
    private boolean clickable;

    private String id;
    //按钮类型
    private String inputType;
    //关键字
    private String keyWords;
    //是否是叶子节点
    private boolean leaf;
    //法律条文
    private String legalProvision;
    //节点类型
    private String nodeType;
    //父类名称
    private String parent;
    //父类根id
    private boolean parentRoot;
    //是否是根
    private boolean root;

    private String text;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public String getChooseSentence() {
        return chooseSentence;
    }

    public void setChooseSentence(String chooseSentence) {
        this.chooseSentence = chooseSentence;
    }

    public String getClearText() {
        return clearText;
    }

    public void setClearText(String clearText) {
        this.clearText = clearText;
    }

    public boolean isClickable() {
        return clickable;
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public String getLegalProvision() {
        return legalProvision;
    }

    public void setLegalProvision(String legalProvision) {
        this.legalProvision = legalProvision;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public boolean isParentRoot() {
        return parentRoot;
    }

    public void setParentRoot(boolean parentRoot) {
        this.parentRoot = parentRoot;
    }

    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Node{" +
                "alias='" + alias + '\'' +
                ", answers=" + answers +
                ", chooseSentence='" + chooseSentence + '\'' +
                ", clearText='" + clearText + '\'' +
                ", clickable=" + clickable +
                ", id='" + id + '\'' +
                ", inputType='" + inputType + '\'' +
                ", keyWords='" + keyWords + '\'' +
                ", leaf=" + leaf +
                ", legalProvision='" + legalProvision + '\'' +
                ", nodeType='" + nodeType + '\'' +
                ", parent='" + parent + '\'' +
                ", parentRoot=" + parentRoot +
                ", root=" + root +
                ", text='" + text + '\'' +
                '}';
    }
}
