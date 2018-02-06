package com.xcjaas.mediation.entity.encapsulation;

/**
 * Created by Administrator on 2018\1\24 0024.
 */
public class Dsr {
    private int dsrId;
    private String dsrName;//当事人名字
    private String dsrTel;//当事人电话
    private int dsrState;
    private int teId;
    private int caseId;//关联案件id

    public int getTeId() {
        return teId;
    }

    public void setTeId(int teId) {
        this.teId = teId;
    }

    public String getDsrName() {
        return dsrName;
    }

    public void setDsrName(String dsrName) {
        this.dsrName = dsrName;
    }


    public String getDsrTel() {
        return dsrTel;
    }

    public void setDsrTel(String dsrTel) {
        this.dsrTel = dsrTel;
    }

    public int getDsrId() {
        return dsrId;
    }

    public void setDsrId(int dsrId) {
        this.dsrId = dsrId;
    }

    public int getDsrState() {
        return dsrState;
    }

    public void setDsrState(int dsrState) {
        this.dsrState = dsrState;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    @Override
    public String toString() {
        return "Dsr{" +
                "dsrId=" + dsrId +
                ", dsrName='" + dsrName + '\'' +
                ", dsrTel='" + dsrTel + '\'' +
                ", dsrState=" + dsrState +
                ", teId=" + teId +
                ", caseId=" + caseId +
                '}';
    }
}