package com.xcjaas.mediation.entity;

import java.util.List;

/**
 * Created by wallaw on 2017/12/19.
 */
public class Node {
    private String alias;
    private List<String> answers;
    private String chooseSentence;
    private String clearText;
    private boolean clickable;
    private String id;
    private String inputType;
    private String keyWords;
    private boolean leaf;
    private String legalProvision;
    private String nodeType;
    private String parent;
    private boolean parentRoot;
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
}
