package com.xcjaas.mediation.entity.encapsulation;

/**
 * Created by Administrator on 2018/1/16.
 * 案件状态为0（准备状态）下的封装类
 */
public class State_Zero {
    private int state_0_id;
    private int state_0_user_id;//准备状态下用户id
    private int state_0_case_id;//准备状态下案件id
    private int state_0_mediator_id;//备选调解员id

    @Override
    public String toString() {
        return "State_Zero{" +
                "state_0_id=" + state_0_id +
                ", state_0_user_id=" + state_0_user_id +
                ", state_0_case_id=" + state_0_case_id +
                ", state_0_mediator_id=" + state_0_mediator_id +
                '}';
    }

    public int getState_0_id() {
        return state_0_id;
    }

    public void setState_0_id(int state_0_id) {
        this.state_0_id = state_0_id;
    }

    public int getState_0_user_id() {
        return state_0_user_id;
    }

    public void setState_0_user_id(int state_0_user_id) {
        this.state_0_user_id = state_0_user_id;
    }

    public int getState_0_case_id() {
        return state_0_case_id;
    }

    public void setState_0_case_id(int state_0_case_id) {
        this.state_0_case_id = state_0_case_id;
    }

    public int getState_0_mediator_id() {
        return state_0_mediator_id;
    }

    public void setState_0_mediator_id(int state_0_mediator_id) {
        this.state_0_mediator_id = state_0_mediator_id;
    }
}
