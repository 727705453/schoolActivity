package com.github.mju.schoolActivity.wx.mp.controller;

import com.github.mju.schoolActivity.wx.mp.model.Result;
import com.github.mju.schoolActivity.wx.mp.model.UserLabel;
import com.github.mju.schoolActivity.wx.mp.service.UserLabelService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/userLabel")
@Controller
@Api
public class UserLabelController {
    @Autowired
    UserLabelService userLabelService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result addUserLabel(UserLabel userLabel){
        return Result.success().addData("result",userLabelService.insert(userLabel));
    }

    @RequestMapping(value = "/change",method = RequestMethod.POST)
    @ResponseBody
    public Result uptUserLabel(UserLabel userLabel){
        return Result.success().addData("result",userLabelService.updateById(userLabel));
    }

    @RequestMapping(value ="/delete",method = RequestMethod.GET)
    @ResponseBody
    public Result delUserLabel(String id){
        return Result.success().addData("result",userLabelService.deleteById(id));
    }

}
