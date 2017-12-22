package com.xcjaas.mediation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wallaw on 2017/12/17.
 */
@Controller
@RequestMapping("/dialog")
public class DialogController {
    @RequestMapping("/index")
    public String index(Model model){
        return "/dialog/index";
    }
}
