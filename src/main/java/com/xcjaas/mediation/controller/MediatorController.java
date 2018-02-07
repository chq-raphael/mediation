package com.xcjaas.mediation.controller;

import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.CaseLog;
import com.xcjaas.mediation.entity.Mediator;
import com.xcjaas.mediation.entity.encapsulation.CaseDetailResult;
import com.xcjaas.mediation.entity.encapsulation.MediatorsResult;
import com.xcjaas.mediation.service.CaseService;
import com.xcjaas.mediation.service.MediatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    @Autowired
    private CaseService caseService;

    /*
    跳转至“调解申请”页面
     */
    @RequestMapping(value = "/to_apply", method = RequestMethod.GET)
    public String toApplyHtml() {
        return "/mediator/m-caseapply";
    }

    //根据案件id查找案件
    @RequestMapping(value = "/case_page", method = RequestMethod.GET)
    @ResponseBody
    public Case apply(@RequestParam("case_id") int caseId) {
        return caseService.selectOneByCaseId(caseId);
    }

    /*
    跳转至“调解详情”页面
     */
    @RequestMapping(value = "/to_detail", method = RequestMethod.GET)
    public String toDetailHtml() {
        return "/mediator/m-casedetail";
    }

    //根据caseId返回单个案件的调解详情
    @RequestMapping(value = "/caseDetail", method = RequestMethod.GET)
    @ResponseBody
    public CaseDetailResult selectCaseDetailByCaseId(@RequestParam("case_id") int caseId) {
        return caseService.selectCaseDetailByCaseId(caseId);
    }

    /*
    跳转至“调解日志”页面
     */
    @RequestMapping(value = "/to_diary", method = RequestMethod.GET)
    public String toDiaryHtml() {
        return "/mediator/m-casediary";
    }

    //根据caseId返回所有的案件日志
    @RequestMapping(value = "/showDiary", method = RequestMethod.GET)
    @ResponseBody
    public List<CaseLog> showLogs(@RequestParam("case_id") int caseId) {
        return caseService.selectLogsByCaseId(caseId);
    }

    //添加日志
    @RequestMapping(value = "/addDiary", method = RequestMethod.GET)
    @ResponseBody
    public int addLog(CaseLog caseLog) {
//        caseLog.setLog_date(DateUtil.getDate());
        System.out.println(caseLog);
        caseService.addLog(caseLog);
        //根据返回的log_id再执行查询语句，如果有数据，返回1表示成功，否则返回0
        if (caseService.selectLogById(caseLog.getLog_id()).getLog_case_id() != 0 && caseService.selectLogById(caseLog.getLog_id()).getLog_detail() != null) {
            return 1;
        } else {
            return 0;
        }

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

    //根据mediatorId返回所有的案件
    @RequestMapping(value = "/mediatorCaseInfo", method = RequestMethod.GET)
    @ResponseBody
    public List<MediatorsResult> mediatorCase() {
        List<MediatorsResult> mediatorsResults = mediatorService.selectMediatorAllCasesById(2);
        return mediatorsResults;
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
        Mediator mediator = mediatorService.selectMediatorById(2);
        return mediator;
    }

}
