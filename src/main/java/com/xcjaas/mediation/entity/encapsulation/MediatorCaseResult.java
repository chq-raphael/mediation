package com.xcjaas.mediation.entity.encapsulation;

import com.xcjaas.mediation.entity.Case;

/**
 * Created by Administrator on 2018\1\31 0031.
 */
public class MediatorCaseResult {
    private Case cas;
    private String type_name;
    private String state_name;

    public Case getCas() {
        return cas;
    }

    public void setCas(Case cas) {
        this.cas = cas;
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
