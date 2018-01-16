package com.xcjaas.mediation.entity;

/**
 * Created by Administrator on 2018/1/16.
 * 案件关联用户和调解员
 */
public class Case {
    private int case_id;
    private int case_type;//案件类型
    private int case_state;//0准备状态，1正在调解，2调解成功，3调解失败
    private int case_user_id;//关联用户id
    private int case_mediator_id;//关联一个调解员id

    @Override
    public String toString() {
        return "Case{" +
                "case_id=" + case_id +
                ", case_type=" + case_type +
                ", case_state=" + case_state +
                ", case_user_id=" + case_user_id +
                ", case_mediator_id=" + case_mediator_id +
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
}
