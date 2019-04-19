package com.github.mju.schoolActivity.wx.mp.controller;


import com.github.mju.schoolActivity.wx.mp.model.Activities;
import com.github.mju.schoolActivity.wx.mp.model.Result;
import com.github.mju.schoolActivity.wx.mp.model.UserActivity;
import com.github.mju.schoolActivity.wx.mp.service.UserActivityService;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;



//用户活动关系(参与/发起)
@RequestMapping("/user_activity")
@RestController
@Api
public class UserActivityController 
{

    @Autowired
    private UserActivityService userActivityService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result addUserActivity(UserActivity userActivity){
        return Result.success().addData("result",userActivityService.insert(userActivity));
    }

    @RequestMapping(value = "/change",method = RequestMethod.POST)
    @ResponseBody
    public Result uptUserActivity(UserActivity userActivity){
        return Result.success().addData("result",userActivityService.updateById(userActivity));
    }

    @RequestMapping(value ="/delete",method = RequestMethod.GET)
    @ResponseBody
    public Result delUserActivity(String id){
        return Result.success().addData("result",userActivityService.deleteById(id));
    }
}
