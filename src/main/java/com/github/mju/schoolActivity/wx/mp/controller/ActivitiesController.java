package com.github.mju.schoolActivity.wx.mp.controller;


import com.github.mju.schoolActivity.wx.mp.service.ActivitiesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;



@RequestMapping("/activities")
@RestController
public class ActivitiesController 
{

    @Autowired
    private ActivitiesService activitiesService;



}
