package com.xcjaas.mediation.service.impl;

import com.xcjaas.mediation.entity.Mediator;
import com.xcjaas.mediation.mapper.MediatorMapper;
import com.xcjaas.mediation.service.MediatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018\1\30 0030.
 */
@Service
public class MediatorServiceImp implements MediatorService {

    @Autowired
    MediatorMapper mediatorMapper;
    @Override
    public Mediator selectMediatorById(int id) {
        return mediatorMapper.selectMediatorById(id);
    }
}
