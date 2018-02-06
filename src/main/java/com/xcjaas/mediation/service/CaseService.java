package com.xcjaas.mediation.service;


import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.CaseLog;
import com.xcjaas.mediation.entity.User;
import com.xcjaas.mediation.entity.encapsulation.CaseDetailResult;
import com.xcjaas.mediation.entity.encapsulation.CaseJudgedDetail;
import com.xcjaas.mediation.entity.encapsulation.Dsr;
import com.xcjaas.mediation.entity.encapsulation.State_Zero;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
public interface CaseService {

    List<Case> selectCasesByUserId(int userId);
    Case selectOneByCaseId(int caseId);
    CaseJudgedDetail selectJudgedDetailByCaseId(int caseId);
    void updateCaseJudgedDetail(CaseJudgedDetail caseJudgedDetail);
    CaseDetailResult selectCaseDetailByCaseId(int caseId);
    List<CaseLog> selectLogsByCaseId(int caseId);
    void addLog(CaseLog caseLog);
}
