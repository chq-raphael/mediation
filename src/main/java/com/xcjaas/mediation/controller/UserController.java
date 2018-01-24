package com.xcjaas.mediation.controller;


import com.xcjaas.mediation.constant.Constant;
import com.xcjaas.mediation.entity.Case;
import com.xcjaas.mediation.entity.User;
import com.xcjaas.mediation.entity.encapsulation.Dsr;
import com.xcjaas.mediation.entity.encapsulation.State_Zero;
import com.xcjaas.mediation.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 * 用户登录
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    public int userId = 0;

    /*
        页面跳转1:跳转到personal-info.html，填写个人信息
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String to_Person_Info_Html() {
        return "/user/register";
    }

    // 在personal-info.html界面，添加用户信息
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public int add(@Param("user") User user) {
        userService.addUser(user);
        userId = user.getUserId();
        return user.getUserId();
    }

    /*
        页面跳转2:填写完个人信息，跳转至mediate-guide.html，确认条款
     */
    @RequestMapping(value = "/mediate-guide", method = RequestMethod.GET)
    public String to_Mediate_Guide_Html() {
        return "/user/mediate-guide";
    }

    //返回文本
    @RequestMapping(value = "/text", method = RequestMethod.GET)
    @ResponseBody
    public String show_Text() {
        return Constant.CONSTANT_TEXT;
    }

    /*
       页面跳转3: 确认条款后，跳转至choice-mediate.html选择调解员
     */
    @RequestMapping(value = "/choice-mediate", method = RequestMethod.GET)
    public String to_Choice_Mediate_Html() {
        return "/user/choice-mediate";
    }

    //返回3个调解员
    @RequestMapping(value = "/mediators3", method = RequestMethod.GET)
    @ResponseBody
    public List<User> show_3Mediators() {
        return userService.selectThreeMediators();
    }

    //存储2个调解员
    @RequestMapping(value = "/mediators2", method = RequestMethod.POST)
    @ResponseBody
    public int insert_2Mediators(@RequestBody List<Integer> choiceM) {

        List<State_Zero> state_Zeros = new ArrayList<>();
        for (int i = 0; i < choiceM.size(); i++) {
            State_Zero sz = new State_Zero();
            sz.setState_0_user_id(userId);
            sz.setState_0_mediator_id(choiceM.get(i));
            state_Zeros.add(sz);
        }
        userService.insertTwoMediators(state_Zeros);

        //如果插入成功返回自增长id，返回0表示插入成功；否则，1表示失败
        if (state_Zeros.get(0).getState_0_id() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    /*
      页面跳转4: 确认条款后，跳转至other-dsr.html选择其他当事人
    */
    @RequestMapping(value = "/other-dsr", method = RequestMethod.GET)
    public String to_Other_Dsr_Html() {
        return "/user/other-dsr";
    }
    @RequestMapping(value = "/dsr", method = RequestMethod.POST)
    @ResponseBody
    public int show_dsr(@RequestBody List<Dsr> dsrInfo) {
        System.out.println(dsrInfo);
        return 0;
    }

    //增加案例
    @RequestMapping(value = "/addCase", method = RequestMethod.GET)
    public String addCase(Case cas) {
        cas.setCase_user_id(100);
        userService.insertCase(cas);
        return "/user/other-dsr";
    }

    /*
    跳转至个人主页, personal.html
     */
    @RequestMapping(value = "/personal", method = RequestMethod.GET)
    public String to_Personal_Html() {
        return "/user/personal";
    }
    @RequestMapping(value = "/personal", method = RequestMethod.POST)
    @ResponseBody
    public User showOne() {
        System.out.println(userId);
        return userService.selectOne(userId);
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
