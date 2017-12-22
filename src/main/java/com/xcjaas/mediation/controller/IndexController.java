package com.xcjaas.mediation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wallaw on 2017/12/1.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("index")
    public String index(Model model){
        return "index";
    }

    @RequestMapping("wss")
    public String ws(Model model){
        return "wss";
    }
}
