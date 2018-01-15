package com.xcjaas.mediation.controller;


import com.xcjaas.mediation.entity.User;
import com.xcjaas.mediation.service.UserService;
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
@RequestMapping("/user")
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
        return "/user/personal-info";
    }

    @RequestMapping(value = "/mediate-guide", method = RequestMethod.GET)
    public String mg() {
        return "/user/mediate-guide";
    }

    @RequestMapping(value = "/choice-mediate", method = RequestMethod.GET)
    public String cm() {
        return "/user/choice-mediate";
    }

    @RequestMapping(value = "/other-dsr", method = RequestMethod.GET)
    public String od() {
        return "/user/other-dsr";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public int add(@Param("user") User user) {
        userService.addUser(user);
        if(user.getUserName()==null){
            //添加失败返回0
            return 0;
        }else {
            //添加成功返回1
            return 1;
        }

    }

    @RequestMapping(value = "/personal", method = RequestMethod.GET)
    public String up() {
        return "/user/personal";
    }

    @RequestMapping(value = "/my-mediate", method = RequestMethod.GET)
    public String mm() {
        return "/user/my-mediate";
    }

    @RequestMapping(value = "/pingjia", method = RequestMethod.GET)
    public String pj() {
        return "/user/pingjia";
    }

}
