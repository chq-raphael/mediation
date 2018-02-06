package com.xcjaas.mediation.entity;

import java.sql.Date;

/**
 * Created by Administrator on 2018\1\31 0031.
 */
public class CaseLog {
    private int log_id;
    private int log_case_id;//案件id
    private Date log_date;//日志时间
    private String log_detail;//日志详情

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public int getLog_case_id() {
        return log_case_id;
    }

    public void setLog_case_id(int log_case_id) {
        this.log_case_id = log_case_id;
    }

    public Date getLog_date() {
        return log_date;
    }

    public void setLog_date(Date log_date) {
        this.log_date = log_date;
    }

    public String getLog_detail() {
        return log_detail;
    }

    public void setLog_detail(String log_detail) {
        this.log_detail = log_detail;
    }
}
