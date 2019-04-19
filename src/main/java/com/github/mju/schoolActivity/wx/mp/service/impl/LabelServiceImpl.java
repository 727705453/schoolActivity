package com.github.mju.schoolActivity.wx.mp.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.mju.schoolActivity.wx.mp.mapper.ActivityLabelMapper;
import com.github.mju.schoolActivity.wx.mp.model.ActivityLabel;
import com.github.mju.schoolActivity.wx.mp.model.Label;
import com.github.mju.schoolActivity.wx.mp.service.LabelService;
import com.github.mju.schoolActivity.wx.mp.mapper.LabelMapper;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;


@Service
public class LabelServiceImpl extends ServiceImpl<LabelMapper, Label>  implements LabelService {
    @Resource
    private LabelMapper labelMapper;

  
}
