package com.xcjaas.mediation.mapper;


import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.User;
import com.xcjaas.mediation.entity.encapsulation.CaseJudgedDetail;
import com.xcjaas.mediation.entity.encapsulation.Dsr;
import com.xcjaas.mediation.entity.encapsulation.State_Zero;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
@Mapper
@Repository
public interface UserMapper {
    void addUser(User user);

    List<User> selectThreeMediators();

    void insertTwoMediators(List<State_Zero> state_Zeros);

    void insertCase(Case cas);

    User selectOne(int userId);

    void insertDsr(List<Dsr> dsrs);

    List<Case> selectCasesByUserId(int userId);

    Case selectOneByCaseId(int caseId);

    CaseJudgedDetail selectJudgedDetailByCaseId(int caseId);

    void updateCaseJudgedDetail(CaseJudgedDetail caseJudgedDetail);

}
