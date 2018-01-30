package com.xcjaas.mediation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018\1\30 0030.
 */
@Controller
@RequestMapping("/mediator")
public class MediatorController {
    @RequestMapping(value = "/to_apply", method = RequestMethod.GET)
    public String toApplyHtml() {
        return "/mediator/m-caseapply";
    }

    @RequestMapping(value = "/to_detail", method = RequestMethod.GET)
    public String toDetailHtml() {
        return "/mediator/m-casedetail";
    }


    @RequestMapping(value = "/to_diary", method = RequestMethod.GET)
    public String toDiaryHtml() {
        return "/mediator/m-casediary";
    }

    @RequestMapping(value = "/to_result", method = RequestMethod.GET)
    public String toResultHtml() {
        return "/mediator/m-caseresult";
    }

    @RequestMapping(value = "/to_mymediate", method = RequestMethod.GET)
    public String toMyMdeaiateHtml() {
        return "/mediator/m-mymediate";
    }

    @RequestMapping(value = "/to_personal", method = RequestMethod.GET)
    public String toPersonalHtml() {
        return "/mediator/m-personal";
    }
}
