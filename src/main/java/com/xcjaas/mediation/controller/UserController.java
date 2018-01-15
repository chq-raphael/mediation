package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/1/10.
 */
@Controller
@RequestMapping("/html")
public class UserController {
    @Autowired
    UserService userService;

    /*
      链接跳转
   */
/*
    @RequestMapping(value = "/other", method = RequestMethod.GET)
    public String index() {
        return "/html/other-dsr";
    }
*/

    @RequestMapping(value = "/p", method = RequestMethod.GET)
    public String p() {
        return "/html/personal-info";
    }

    @RequestMapping(value = "/mediate-guide", method = RequestMethod.GET)
    public String mg() {
        return "/html/mediate-guide";
    }

    @RequestMapping(value = "/choice-mediate", method = RequestMethod.GET)
    public String cm() {
        return "/html/choice-mediate";
    }

    @RequestMapping(value = "/other-dsr", method = RequestMethod.GET)
    public String od() {
        return "/html/other-dsr";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public int add(@Param("user") User user) {

        userService.add(user);
        System.out.println(user);
        return user.getUserId();
    }

    @RequestMapping(value = "/user-personal", method = RequestMethod.GET)
    public String up() {
        return "/html/user-personal";
    }

    @RequestMapping(value = "/my-mediate", method = RequestMethod.GET)
    public String mm() {
        return "/html/my-mediate";
    }

    @RequestMapping(value = "/pingjia", method = RequestMethod.GET)
    public String pj() {
        return "/html/pingjia";
    }

}
