package com.xcjaas.mediation.service;


import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.CaseLog;
import com.xcjaas.mediation.entity.encapsulation.CaseDetailResult;
import com.xcjaas.mediation.entity.encapsulation.CaseJudgedDetail;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
public interface CaseService {

    //根据id查找个人所有案件
    List<Case> selectCasesByUserId(int userId);
    //根据案件id查找一个案件
    Case selectOneByCaseId(int caseId);
    //根据案件id查找一个案件的评价
    CaseJudgedDetail selectJudgedDetailByCaseId(int caseId);
    //插入评价
    void updateCaseJudgedDetail(CaseJudgedDetail caseJudgedDetail);
    //根据案件id返回调解详情
    CaseDetailResult selectCaseDetailByCaseId(int caseId);
    //根据caseId查询这个案件所有的日志
    List<CaseLog> selectLogsByCaseId(int caseId);
    //添加日志
    void addLog(CaseLog caseLog);
    //根据caseId查找日志
    CaseLog selectLogById(int logId);
}
