package com.github.mju.schoolActivity.wx.mp.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.mju.schoolActivity.wx.mp.mapper.LabelMapper;
import com.github.mju.schoolActivity.wx.mp.model.Label;
import com.github.mju.schoolActivity.wx.mp.model.UserActivity;
import com.github.mju.schoolActivity.wx.mp.service.UserActivityService;
import com.github.mju.schoolActivity.wx.mp.mapper.UserActivityMapper;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;


@Service
public class UserActivityServiceImpl extends ServiceImpl<UserActivityMapper, UserActivity> implements UserActivityService {
    @Resource
    private UserActivityMapper userActivityMapper;

  
}
