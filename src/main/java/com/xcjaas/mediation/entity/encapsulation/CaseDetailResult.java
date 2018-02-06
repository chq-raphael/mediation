package com.xcjaas.mediation.entity.encapsulation;


import java.sql.Date;
import java.util.List;

/**
 * Created by Administrator on 2018\2\6 0006.
 */

public class CaseDetailResult {
    private int case_Id;
    private String details;//案件详情
    private Date create_date;//调解创建时间
    private Date accept_date;//调解受理时间
    private List<CaseDetail_Dsr> dsrs;//其他当事人
    private String userName;//用户名字
    private String userTel;//用户电话

    public int getCase_Id() {
        return case_Id;
    }

    public void setCase_Id(int case_Id) {
        this.case_Id = case_Id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getAccept_date() {
        return accept_date;
    }

    public void setAccept_date(Date accept_date) {
        this.accept_date = accept_date;
    }

    public List<CaseDetail_Dsr> getDsrs() {
        return dsrs;
    }

    public void setDsrs(List<CaseDetail_Dsr> dsrs) {
        this.dsrs = dsrs;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
}
