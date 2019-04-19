package com.github.mju.schoolActivity.wx.mp.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.mju.schoolActivity.wx.mp.model.ActivityLabel;
import com.github.mju.schoolActivity.wx.mp.service.ActivityLabelService;


import com.github.mju.schoolActivity.wx.mp.mapper.ActivityLabelMapper;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;



@Service
public class ActivityLabelServiceImpl extends ServiceImpl<ActivityLabelMapper, ActivityLabel> implements ActivityLabelService {

    @Resource
    private ActivityLabelMapper activityLabelMapper;


}
