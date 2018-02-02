package com.xcjaas.mediation.controller;

import com.xcjaas.mediation.entity.Mediator;
import com.xcjaas.mediation.entity.encapsulation.MediatorsResult;
import com.xcjaas.mediation.service.MediatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018\1\30 0030.
 */
@Controller
@RequestMapping("/mediator")
public class MediatorController {

    @Autowired
    private MediatorService mediatorService;

    public int stateNum=0;

    /*
    跳转至“调解申请”页面
     */
    @RequestMapping(value = "/to_apply", method = RequestMethod.GET)
    public String toApplyHtml() {
        return "/mediator/m-caseapply";
    }

    /*
    跳转至“调解详情”页面
     */
    @RequestMapping(value = "/to_detail", method = RequestMethod.GET)
    public String toDetailHtml() {
        return "/mediator/m-casedetail";
    }

    /*
    跳转至“调解日志”页面
     */
    @RequestMapping(value = "/to_diary", method = RequestMethod.GET)
    public String toDiaryHtml() {
        return "/mediator/m-casediary";
    }

    /*
    跳转至“调解结果”页面
     */
    @RequestMapping(value = "/to_result", method = RequestMethod.GET)
    public String toResultHtml() {
        return "/mediator/m-caseresult";
    }

    /*
    跳转至调解员“我的调解”页面
     */
    @RequestMapping(value = "/to_mymediate", method = RequestMethod.GET)
    public String toMyMdeaiateHtml() {
        return "/mediator/m-mymediate";
    }
    //返回页面stateNum
    @RequestMapping(value = "/stateNum", method = RequestMethod.GET)
    @ResponseBody
    public int stateNum() {
        return stateNum;
    }

    @RequestMapping(value = "/mediatorCaseInfo", method = RequestMethod.GET)
    @ResponseBody
    public List<MediatorsResult> mediatorCase() {
        try {
            List<MediatorsResult> mediatorsResults=mediatorService.selectMediatorAllCasesById(2);
            return mediatorsResults;
        }finally {
           //.....释放

        }

    }

    /*
    跳转至调解员的个人主页
     */
    @RequestMapping(value = "/to_personal", method = RequestMethod.GET)
    public String toPersonalHtml() {
        return "/mediator/m-personal";
    }
    //在调解员个人主页上展示个人信息
    @RequestMapping(value = "/showMediatorInfo", method = RequestMethod.GET)
    @ResponseBody
    public Mediator mediator_personal() {
        Mediator mediator=mediatorService.selectMediatorById(2);
        System.out.println(mediator);
        return mediator;
    }
    //存储state_num值用来判断跳转至“我的调解”的哪个模块
    @RequestMapping(value="/saveNum",method =RequestMethod.GET)
    @ResponseBody
     public void saveNum(int state_num){
        stateNum=state_num;
    }

    @RequestMapping(value="/test",method =RequestMethod.GET)
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public void test(){
        System.out.println("---------------1");

        System.out.println("...............2");

    }

}
