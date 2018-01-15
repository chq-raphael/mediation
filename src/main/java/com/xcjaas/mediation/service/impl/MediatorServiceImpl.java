package com.xcjaas.mediation.service.impl;

import com.xcjaas.mediation.entity.Mediator;
import com.xcjaas.mediation.mapper.MediatorMapper;
import com.xcjaas.mediation.service.MediatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5.
 */
@Service
public class MediatorServiceImpl implements MediatorService {

    @Autowired
    MediatorMapper mediatorMapper;

    @Override
    public void addMediator(Mediator mediator) {
        mediatorMapper.addMediator(mediator);
    }

    @Override
    public void deleteMediator(int id) {
        mediatorMapper.deleteMediator(id);
    }

    @Override
    public void modifyMediator(Mediator mediator) {
        mediatorMapper.modifyMediator(mediator);
    }

    @Override
    public Mediator selectMediatorById(int id) {
        return mediatorMapper.selectMediatorById(id);
    }

    @Override
    public List<Mediator> selectMediatorsByPage(String search) {
        return mediatorMapper.selectMediatorsByPage(search);
    }

    @Override
    public void enable(Mediator mediator) {
        mediatorMapper.enable(mediator);
    }

    @Override
    public void disable(Mediator mediator) {
        mediatorMapper.disable(mediator);
    }
}
