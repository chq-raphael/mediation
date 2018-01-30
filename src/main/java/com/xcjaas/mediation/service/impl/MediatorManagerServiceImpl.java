package com.xcjaas.mediation.service.impl;

import com.xcjaas.mediation.entity.Mediator;
import com.xcjaas.mediation.mapper.MediatorManagerMapper;
import com.xcjaas.mediation.service.MediatorManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5.
 */
@Service
public class MediatorManagerServiceImpl implements MediatorManagerService {

    @Autowired
    MediatorManagerMapper mediatorManagerMapper;

    @Override
    public void addMediator(Mediator mediator) {
        mediatorManagerMapper.addMediator(mediator);
    }

    @Override
    public void deleteMediator(int id) {
        mediatorManagerMapper.deleteMediator(id);
    }

    @Override
    public void modifyMediator(Mediator mediator) {
        mediatorManagerMapper.modifyMediator(mediator);
    }

    @Override
    public Mediator selectMediatorById(int id) {
        return mediatorManagerMapper.selectMediatorById(id);
    }

    @Override
    public List<Mediator> selectMediatorsByPage(String search) {
        return mediatorManagerMapper.selectMediatorsByPage(search);
    }

    @Override
    public void enable(Mediator mediator) {
        mediatorManagerMapper.enable(mediator);
    }

    @Override
    public void disable(Mediator mediator) {
        mediatorManagerMapper.disable(mediator);
    }
}
