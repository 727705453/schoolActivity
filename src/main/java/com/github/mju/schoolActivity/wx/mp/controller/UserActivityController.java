package com.github.mju.schoolActivity.wx.mp.controller;


import com.github.mju.schoolActivity.wx.mp.service.UserActivityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;




@RequestMapping("/user_activity")
@RestController
public class UserActivityController 
{

    @Autowired
    private UserActivityService userActivityService;


}
