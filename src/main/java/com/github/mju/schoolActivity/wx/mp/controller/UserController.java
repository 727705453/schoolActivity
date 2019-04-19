package com.github.mju.schoolActivity.wx.mp.controller;


import com.github.mju.schoolActivity.wx.mp.model.Activities;
import com.github.mju.schoolActivity.wx.mp.model.Result;
import com.github.mju.schoolActivity.wx.mp.model.User;
import com.github.mju.schoolActivity.wx.mp.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

//用户管理
@RequestMapping("/user")
@RestController
@Api
public class UserController 
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result addUser(User user){
        return Result.success().addData("result",userService.insert(user));
    }

    @RequestMapping(value = "/change",method = RequestMethod.POST)
    @ResponseBody
    public Result uptUser(User user){
        return Result.success().addData("result",userService.updateById(user));
    }

    @RequestMapping(value ="/delete",method = RequestMethod.GET)
    @ResponseBody
    public Result delUser(String id){
        return Result.success().addData("result",userService.deleteById(id));
    }
}
