package com.github.mju.schoolActivity.wx.mp.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.mju.schoolActivity.wx.mp.mapper.UserLabelMapper;
import com.github.mju.schoolActivity.wx.mp.mapper.UserMapper;
import com.github.mju.schoolActivity.wx.mp.model.UserLabel;
import com.github.mju.schoolActivity.wx.mp.service.UserLabelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserLabelServiceImpl extends ServiceImpl<UserLabelMapper, UserLabel> implements UserLabelService {

    @Resource
    private UserMapper userMapper;
}
