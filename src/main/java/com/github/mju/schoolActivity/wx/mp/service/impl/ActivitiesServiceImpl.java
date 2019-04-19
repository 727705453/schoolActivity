package com.github.mju.schoolActivity.wx.mp.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.mju.schoolActivity.wx.mp.model.Activities;
import com.github.mju.schoolActivity.wx.mp.service.ActivitiesService;


import com.github.mju.schoolActivity.wx.mp.mapper.ActivitiesMapper;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;



@Service
public class ActivitiesServiceImpl extends ServiceImpl<ActivitiesMapper, Activities> implements ActivitiesService {
    @Resource
    private ActivitiesMapper activitiesMapper;

  
}
