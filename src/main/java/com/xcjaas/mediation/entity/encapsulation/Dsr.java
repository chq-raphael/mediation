package com.xcjaas.mediation.entity.encapsulation;

/**
 * Created by Administrator on 2018\1\24 0024.
 */
public class Dsr {
    private String dsrName;
    private String dsrTel;

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

    @Override
    public String toString() {
        return "Dsr{" +
                "dsrName='" + dsrName + '\'' +
                ", dsrTel='" + dsrTel + '\'' +
                '}';
    }
}