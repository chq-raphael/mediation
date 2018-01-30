package com.xcjaas.mediation.service;

import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.Mediator;

import java.util.List;

/**
 * Created by Administrator on 2018\1\30 0030.
 */
public interface MediatorService {
    Mediator selectMediatorById(int id);

    List<Case> selectMediatorCaseById(int id);
}
