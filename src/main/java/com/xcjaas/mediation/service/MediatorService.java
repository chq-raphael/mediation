package com.xcjaas.mediation.service;

import com.xcjaas.mediation.entity.Mediator;
import com.xcjaas.mediation.entity.encapsulation.MediatorsResult;

import java.util.List;

/**
 * Created by Administrator on 2018\1\30 0030.
 */
public interface MediatorService {
    //根据id查找调解员
    Mediator selectMediatorById(int id);
    //根据id查找调解员所有的调解案件
    List<MediatorsResult> selectMediatorAllCasesById(int mediatorId);


}
