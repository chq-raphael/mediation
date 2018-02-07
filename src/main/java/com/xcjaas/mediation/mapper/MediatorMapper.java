package com.xcjaas.mediation.mapper;

import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.Mediator;
import com.xcjaas.mediation.entity.encapsulation.MediatorsResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018\1\30 0030.
 */
@Mapper
@Repository
public interface MediatorMapper {
    //根据id查找调解员
    Mediator selectMediatorById(int id);
    //根据id查找调解员所有的调解案件
    List<MediatorsResult> selectMediatorAllCasesById(int mediatorId);

}
