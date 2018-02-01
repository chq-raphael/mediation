package com.xcjaas.mediation.entity;


import java.sql.Date;

/**
 * Created by Administrator on 2018/1/16.
 * 案件关联用户和调解员
 */
public class Case {
    private int case_id;//案件id
    private int case_type;//案件类型
    private int case_state;//0准备状态，1正在调解，2调解成功，3调解失败
    private int case_user_id;//关联用户id
    private int case_mediator_id;//关联一个调解员id
    private int judged_state;//用户是否评价，0未评价，1已评价（judged_state=1只有case_state=2或者3的情况下）
    private String details;//案件详情
    private String court;//隶属法院
    private Date create_date;//案件创建时间
    private String type_name;//案件类型名字
    private String state_name;//案件状态名字

    @Override
    public String toString() {
        return "Case{" +
                "case_id=" + case_id +
                ", case_type=" + case_type +
                ", case_state=" + case_state +
                ", case_user_id=" + case_user_id +
                ", case_mediator_id=" + case_mediator_id +
                ", judged_state=" + judged_state +
                ", details='" + details + '\'' +
                ", court='" + court + '\'' +
                ", create_date='" + create_date + '\'' +
                ", type_name='" + type_name + '\'' +
                ", state_name='" + state_name + '\'' +
                '}';
    }



    public int getCase_id() {
        return case_id;
    }

    public void setCase_id(int case_id) {
        this.case_id = case_id;
    }

    public int getCase_type() {
        return case_type;
    }

    public void setCase_type(int case_type) {
        this.case_type = case_type;
    }

    public int getCase_state() {
        return case_state;
    }

    public void setCase_state(int case_state) {
        this.case_state = case_state;
    }

    public int getCase_user_id() {
        return case_user_id;
    }

    public void setCase_user_id(int case_user_id) {
        this.case_user_id = case_user_id;
    }

    public int getCase_mediator_id() {
        return case_mediator_id;
    }

    public void setCase_mediator_id(int case_mediator_id) {
        this.case_mediator_id = case_mediator_id;
    }

    public int getJudged_state() {
        return judged_state;
    }

    public void setJudged_state(int judged_state) {
        this.judged_state = judged_state;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }
}
