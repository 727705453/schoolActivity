package com.github.mju.schoolActivity.wx.mp.controller;


import com.github.mju.schoolActivity.wx.mp.model.Activities;
import com.github.mju.schoolActivity.wx.mp.model.Result;
import com.github.mju.schoolActivity.wx.mp.service.ActivitiesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


//活动
@RequestMapping("/activities")
@RestController
@Api
public class ActivitiesController 
{

    @Autowired
    private ActivitiesService activitiesService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result addActivity(Activities activities){
        return Result.success().addData("result",activitiesService.insert(activities));
    }

    @RequestMapping(value = "/change",method = RequestMethod.POST)
    @ResponseBody
    public Result uptActivity(Activities activities){
        return Result.success().addData("result",activitiesService.updateById(activities));
    }

    @RequestMapping(value ="/delete",method = RequestMethod.GET)
    @ResponseBody
    public Result delActivity(String id){
        return Result.success().addData("result",activitiesService.deleteById(id));
    }
}
