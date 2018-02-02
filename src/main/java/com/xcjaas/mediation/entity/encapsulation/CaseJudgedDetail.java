package com.xcjaas.mediation.entity.encapsulation;

/**
 * Created by Administrator on 2018\2\1 0001.
 */
public class CaseJudgedDetail {
    private int case_id;
    private String judged_detail;

    public int getCase_id() {
        return case_id;
    }

    public void setCase_id(int case_id) {
        this.case_id = case_id;
    }

    public String getJudged_detail() {
        return judged_detail;
    }

    public void setJudged_detail(String judged_detail) {
        this.judged_detail = judged_detail;
    }

    @Override
    public String toString() {
        return "CaseJudgedDetail{" +
                "case_id=" + case_id +
                ", judged_detail='" + judged_detail + '\'' +
                '}';
    }
}
