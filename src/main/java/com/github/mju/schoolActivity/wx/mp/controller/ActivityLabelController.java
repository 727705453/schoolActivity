package com.github.mju.schoolActivity.wx.mp.controller;

import com.github.mju.schoolActivity.wx.mp.model.Activities;
import com.github.mju.schoolActivity.wx.mp.model.ActivityLabel;
import com.github.mju.schoolActivity.wx.mp.model.Result;
import com.github.mju.schoolActivity.wx.mp.service.ActivityLabelService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;



//活动标签
@RequestMapping("/activity")
@RestController
@Api
public class ActivityLabelController 
{

    @Autowired
    private ActivityLabelService activityLabelService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result addActivityLabel(ActivityLabel activityLabel){
        return Result.success().addData("result",activityLabelService.insert(activityLabel));
    }

    @RequestMapping(value = "/change",method = RequestMethod.POST)
    @ResponseBody
    public Result uptActivityLabel(ActivityLabel activityLabel){
        return Result.success().addData("result",activityLabelService.updateById(activityLabel));
    }

    @RequestMapping(value ="/delete",method = RequestMethod.GET)
    @ResponseBody
    public Result delActivityLabel(String id){
        return Result.success().addData("result",activityLabelService.deleteById(id));
    }
}
