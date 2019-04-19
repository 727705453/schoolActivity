package com.github.mju.schoolActivity.wx.mp.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.mju.schoolActivity.wx.mp.mapper.UserActivityMapper;
import com.github.mju.schoolActivity.wx.mp.mapper.UserMapper;
import com.github.mju.schoolActivity.wx.mp.model.User;
import com.github.mju.schoolActivity.wx.mp.model.UserActivity;
import com.github.mju.schoolActivity.wx.mp.service.UserService;
import org.springframework.stereotype.Service;
;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;

  
}
