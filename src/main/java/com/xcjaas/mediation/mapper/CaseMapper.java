package com.xcjaas.mediation.mapper;

import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.encapsulation.CaseJudgedDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018\2\5 0005.
 */
@Mapper
@Repository
public interface CaseMapper {
    List<Case> selectCasesByUserId(int userId);

    Case selectOneByCaseId(int caseId);

    CaseJudgedDetail selectJudgedDetailByCaseId(int caseId);

    void updateCaseJudgedDetail(CaseJudgedDetail caseJudgedDetail);

}
