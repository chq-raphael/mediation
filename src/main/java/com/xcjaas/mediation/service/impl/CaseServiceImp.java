package com.xcjaas.mediation.service.impl;

import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.encapsulation.CaseJudgedDetail;
import com.xcjaas.mediation.mapper.CaseMapper;
import com.xcjaas.mediation.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018\2\5 0005.
 */
@Service
public class CaseServiceImp implements CaseService {
    @Autowired
    CaseMapper caseMapper;

    @Override
    public List<Case> selectCasesByUserId(int userId) {
        return caseMapper.selectCasesByUserId(userId);
    }

    @Override
    public Case selectOneByCaseId(int caseId) {
        return caseMapper.selectOneByCaseId(caseId);
    }

    @Override
    public CaseJudgedDetail selectJudgedDetailByCaseId(int caseId) {
        return caseMapper.selectJudgedDetailByCaseId(caseId);
    }

    @Override
    public void updateCaseJudgedDetail(CaseJudgedDetail caseJudgedDetail) {
            caseMapper.updateCaseJudgedDetail(caseJudgedDetail);
    }

    @Override
    public Case selectCaseDetailByCaseId(int caseId) {
        return caseMapper.selectCaseDetailByCaseId(caseId);
    }
}
