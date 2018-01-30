package com.xcjaas.mediation.mapper;

import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.Mediator;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018\1\30 0030.
 */
@Mapper
@Repository
public interface MediatorMapper {
    Mediator selectMediatorById(int id);

    List<Case> selectMediatorCaseById(int id);
}
