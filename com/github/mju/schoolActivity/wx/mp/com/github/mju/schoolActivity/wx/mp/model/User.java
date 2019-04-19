package com.github.mju.schoolActivity.wx.mp.model;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author dtw
 * @since 2019-03-15
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("userId")
    private Integer userId;

    @TableField("userDesc")
    private String userDesc;

    /**
     * 0：女 1：男 2:未知
     */
    private Integer gender;

    private String tel;

    @TableField("msgNum")
    private Integer msgNum;

    private String label;

    /**
     * 个人/团体/管理员
     */
    @TableField("userType")
    private Integer userType;

    /**
     * 以后可能有用
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 以后拓展可能有用
     */
    @TableField("attendDays")
    private Integer attendDays;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getMsgNum() {
        return msgNum;
    }

    public void setMsgNum(Integer msgNum) {
        this.msgNum = msgNum;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getAttendDays() {
        return attendDays;
    }

    public void setAttendDays(Integer attendDays) {
        this.attendDays = attendDays;
    }

    @Override
    public String toString() {
        return "User{" +
        "userId=" + userId +
        ", userDesc=" + userDesc +
        ", gender=" + gender +
        ", tel=" + tel +
        ", msgNum=" + msgNum +
        ", label=" + label +
        ", userType=" + userType +
        ", createTime=" + createTime +
        ", attendDays=" + attendDays +
        "}";
    }
}
