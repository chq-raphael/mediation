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
public class Nodes {

    private Long mid;
    private Long rootId;
    private String sanswers;
    private String skey;
    private String soptions;

    private String alias;
    private List<String> answers;
    private String chooseSentence;
    private boolean clickable;
    private String id;
    private String inputType;
    private List<String> keyWords;
    private boolean leaf;
    private String legalProvision;
    private String loopCondition;
    private String loopTemplates;
    private String nodeType;
    private List<String> options;
    private String paramName;
    private String parent;
    private boolean parentRoot;
    private String predictionResult;
    private boolean root;
    private String text;
    private String clearText;

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Long getRootId() {
        return rootId;
    }

    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    public String getSanswers() {
        if (answers != null && answers.size()>0){
            StringBuffer stringBuffer = new StringBuffer();
            for (String str:answers){
                stringBuffer.append(str+"|");
            }
            sanswers = stringBuffer.toString();
        }
        return sanswers;
    }

    public void setSanswers(String sanswers) {
        this.sanswers = sanswers;
    }

    public String getSkey() {
        if (keyWords != null && keyWords.size()>0){
            StringBuffer stringBuffer = new StringBuffer();
            for (String str:keyWords){
                stringBuffer.append(str+"|");
            }
            skey = stringBuffer.toString();
        }
        return skey;
    }

    public void setSkey(String skey) {
        this.skey = skey;
    }

    public String getSoptions() {
        if (options != null && options.size()>0){
            StringBuffer stringBuffer = new StringBuffer();
            for (String str:options){
                stringBuffer.append(str+"|");
            }
            soptions = stringBuffer.toString();
        }
        return soptions;
    }

    public void setSoptions(String soptions) {
        this.soptions = soptions;
    }

    public boolean isClickable() {
        return clickable;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public boolean isParentRoot() {
        return parentRoot;
    }

    public boolean isRoot() {
        return root;
    }

    public void setAlias(String alias) {
         this.alias = alias;
     }
     public String getAlias() {
         return alias;
     }

    public void setAnswers(List<String> answers) {
         this.answers = answers;
     }
     public List<String> getAnswers() {
         return answers;
     }

    public void setChooseSentence(String chooseSentence) {
         this.chooseSentence = chooseSentence;
     }
     public String getChooseSentence() {
         return chooseSentence;
     }

    public void setClickable(boolean clickable) {
         this.clickable = clickable;
     }
     public boolean getClickable() {
         return clickable;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setInputType(String inputType) {
         this.inputType = inputType;
     }
     public String getInputType() {
         return inputType;
     }

    public void setKeyWords(List<String> keyWords) {
         this.keyWords = keyWords;
     }
     public List<String> getKeyWords() {
         return keyWords;
     }

    public void setLeaf(boolean leaf) {
         this.leaf = leaf;
     }
     public boolean getLeaf() {
         return leaf;
     }

    public void setLegalProvision(String legalProvision) {
         this.legalProvision = legalProvision;
     }
     public String getLegalProvision() {
         return legalProvision;
     }

    public void setLoopCondition(String loopCondition) {
         this.loopCondition = loopCondition;
     }
     public String getLoopCondition() {
         return loopCondition;
     }

    public void setLoopTemplates(String loopTemplates) {
         this.loopTemplates = loopTemplates;
     }
     public String getLoopTemplates() {
         return loopTemplates;
     }

    public void setNodeType(String nodeType) {
         this.nodeType = nodeType;
     }
     public String getNodeType() {
         return nodeType;
     }

    public void setOptions(List<String> options) {
         this.options = options;
     }
     public List<String> getOptions() {
         return options;
     }

    public void setParamName(String paramName) {
         this.paramName = paramName;
     }
     public String getParamName() {
         return paramName;
     }

    public void setParent(String parent) {
         this.parent = parent;
     }
     public String getParent() {
         return parent;
     }

    public void setParentRoot(boolean parentRoot) {
         this.parentRoot = parentRoot;
     }
     public boolean getParentRoot() {
         return parentRoot;
     }

    public void setPredictionResult(String predictionResult) {
         this.predictionResult = predictionResult;
     }
     public String getPredictionResult() {
         return predictionResult;
     }

    public void setRoot(boolean root) {
         this.root = root;
     }
     public boolean getRoot() {
         return root;
     }

    public void setText(String text) {
         this.text = text;
     }
     public String getText() {
         return text;
     }

    public void setClearText(String clearText) {
         this.clearText = clearText;
     }
     public String getClearText() {
         return clearText;
     }

}