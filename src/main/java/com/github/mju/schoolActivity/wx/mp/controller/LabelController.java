package com.github.mju.schoolActivity.wx.mp.controller;


import com.github.mju.schoolActivity.wx.mp.model.Activities;
import com.github.mju.schoolActivity.wx.mp.model.Label;
import com.github.mju.schoolActivity.wx.mp.model.Result;
import com.github.mju.schoolActivity.wx.mp.service.LabelService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;




//标签
@RequestMapping("/label")
@RestController
@Api
public class LabelController 
{

    @Autowired
    private LabelService labelService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result addLabel(Label label){
        return Result.success().addData("result",labelService.insert(label));
    }

    @RequestMapping(value = "/change",method = RequestMethod.POST)
    @ResponseBody
    public Result uptLabel(Label label){
        return Result.success().addData("result",labelService.updateById(label));
    }

    @RequestMapping(value ="/delete",method = RequestMethod.GET)
    @ResponseBody
    public Result delLabel(String id){
        return Result.success().addData("result",labelService.deleteById(id));
    }
}
