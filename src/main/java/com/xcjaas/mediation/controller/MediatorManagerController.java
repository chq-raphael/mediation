package com.xcjaas.mediation.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xcjaas.mediation.constant.Constant;
import com.xcjaas.mediation.entity.Mediator;
import com.xcjaas.mediation.entity.encapsulation.MediatorsResult;
import com.xcjaas.mediation.service.MediatorService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by Administrator on 2018/1/5.
 */
@Controller
@RequestMapping("/mediatorM")
public class MediatorManagerController {

    @Autowired
    private MediatorService mediatorService;

    /*
    链接跳转index.html
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/mediator/index";
    }

    /*
    index.html查找数据
     */
    @RequestMapping(value = "/data", method = RequestMethod.POST)
    @ResponseBody
    public MediatorsResult showData(String search, Integer pageNo) {

        pageNo = pageNo == null ? 1 : pageNo;
        MediatorsResult mediatorsResult = new MediatorsResult();
        Page page = PageHelper.startPage(pageNo, 5);
        List<Mediator> mediators = mediatorService.selectMediatorsByPage(search);

        mediatorsResult.setMediators(mediators);
        mediatorsResult.setPageNo(pageNo);
        mediatorsResult.setTotalSize(mediators.size());
        mediatorsResult.setPages(page.getPages());

        return mediatorsResult;
    }

    /*
      index.html 链接跳转addMediator.html
       */
    @RequestMapping(value = "/addMediatorHtml", method = RequestMethod.GET)
    public String addMediatorHtml() {
        return "/mediator/addMediator";
    }

    @RequestMapping(value = "/addMediator", method = RequestMethod.POST)
    public String addMediator(Mediator mediator,@RequestParam("file") MultipartFile file) {
        mediator.setState(0);
        System.out.println(mediator);
        if (!file.isEmpty()) {
            try {
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(
                                new File(Constant.CONSTANT_PATH + mediator.getName() + ".jpg")));
                out.write(file.getBytes());
                out.flush();
                out.close();
                String filename = "\\webapp\\img-mediator\\" + mediator.getName() + ".jpg";
                mediator.setPicture(filename);
                System.out.println(mediator);
                mediatorService.addMediator(mediator);
            } catch (Exception e) {
                e.printStackTrace();
                return e.getMessage();
            }
            return "/mediator/index";
        } else {
            return "上传失败，文件为空！";
        }
    }

    /*
    链接跳转editor.html
     */
    @RequestMapping(value = "/editor", method = RequestMethod.GET)
    public String modify() {
        return "/mediator/editor";
    }

    /*
    editor.html页面查找一个调解员
     */
    @RequestMapping(value = "/selectMediatorById", method = RequestMethod.POST)
    @ResponseBody
    public Mediator selectMediatorById(int id) {
        Mediator mediator = mediatorService.selectMediatorById(id);
        return mediator;
    }

    /*
    editor.html修改一个调解员基本信息
     */
    @RequestMapping(value = "/modifyMediator", method = RequestMethod.POST)
    public String modifyMediator(Mediator mediator) {
        mediatorService.modifyMediator(mediator);
        return "/mediator/index";
    }

    /*
    editor.html删除一个调解员
     */
    @RequestMapping(value = "/deleteMediatorById", method = RequestMethod.GET)
    public String deleteMediatorById(@Param("id") int id) {
        mediatorService.deleteMediator(id);
        return "/mediator/index";
    }

    /*
   index.html 启用/停用
    */
    @RequestMapping(value = "/changeState", method = RequestMethod.POST)
    public String changeState(Mediator mediator) {

        if (mediator.getState() == 0) {
            //0启用状态
            mediatorService.disable(mediator);
        } else {
            //1停用状态
            mediatorService.enable(mediator);
        }
        return "/mediator/index";
    }
}
