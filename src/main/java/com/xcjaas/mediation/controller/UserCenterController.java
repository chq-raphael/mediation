package com.xcjaas.mediation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wallaw on 2017/12/1.
 */
@Controller
@RequestMapping("/uc")
public class UserCenterController {

    @RequestMapping("profile")
    public String profile(Model model){

        return "profile";
    }
}
