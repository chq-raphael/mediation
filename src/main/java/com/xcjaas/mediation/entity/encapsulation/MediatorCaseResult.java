package com.xcjaas.mediation.entity.encapsulation;

import com.xcjaas.mediation.entity.Case;

/**
 * Created by Administrator on 2018\1\31 0031.
 */
public class MediatorCaseResult {
    private int case_id;
    private int case_type;//案件类型
    private int case_state;//0准备状态，1正在调解，2调解成功，3调解失败
    private int case_user_id;//关联用户id
    private int case_mediator_id;//关联一个调解员id
    private String type_name;

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

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }


    @Override
    public String toString() {
        return "MediatorCaseResult{" +
                "case_id=" + case_id +
                ", case_type=" + case_type +
                ", case_state=" + case_state +
                ", case_user_id=" + case_user_id +
                ", case_mediator_id=" + case_mediator_id +
                ", type_name='" + type_name + '\'' +
                '}';
    }
}
