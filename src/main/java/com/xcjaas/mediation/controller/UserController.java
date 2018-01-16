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
 * 用户登录
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
    /*
        页面跳转1:跳转到personal-info.html，填写个人信息
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String to_Person_Info_Html() {
        return "/user/register";
    }

    /*
        页面跳转2:填写完个人信息，跳转至mediate-guide.html，确认条款
     */
    @RequestMapping(value = "/mediate-guide", method = RequestMethod.GET)
    public String to_Mediate_Guide_Html() {
        return "/user/mediate-guide";
    }

    /*
       页面跳转3: 确认条款后，跳转至choice-mediate.html选择调解员
     */
    @RequestMapping(value = "/choice-mediate", method = RequestMethod.GET)
    public String to_Choice_Mediate_Html() {
        return "/user/choice-mediate";
    }

    /*
      页面跳转4: 确认条款后，跳转至other-dsr.html选择其他当事人
    */
    @RequestMapping(value = "/other-dsr", method = RequestMethod.GET)
    public String to_Other_Dsr_Html() {
        return "/user/other-dsr";
    }

    /*
    在personal-info.html界面，添加用户信息
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public int add(@Param("user") User user) {
        userService.addUser(user);
        if (user.getUserName() == null) {
            //添加失败返回0
            return 0;
        } else {
            //添加成功返回1
            return 1;
        }

    }
    /*
    跳转至个人主页, personal.html
     */
    @RequestMapping(value = "/personal", method = RequestMethod.GET)
    public String to_Personal_Html() {
        return "/user/personal";
    }

    /*
    跳转至我的调解,my-mediate.html
     */
    @RequestMapping(value = "/my-mediate", method = RequestMethod.GET)
    public String to_My_Mediate_Html() {
        return "/user/my-mediate";
    }

    /*
    跳转至评价界面，pingjia.html
     */
    @RequestMapping(value = "/pingjia", method = RequestMethod.GET)
    public String to_Pingjia_Html() {
        return "/user/pingjia";
    }

}
