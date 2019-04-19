package com.github.mju.schoolActivity.wx.mp.service.impl;

import com.github.mju.schoolActivity.wx.mp.model.User;
import com.github.mju.schoolActivity.wx.mp.dao.UserMapper;
import com.github.mju.schoolActivity.wx.mp.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dtw
 * @since 2019-03-15
 */
@Service
public class UserServiceImpl extends impl<UserMapper, User> implements UserService {

}
