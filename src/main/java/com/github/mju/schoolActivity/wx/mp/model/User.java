package com.github.mju.schoolActivity.wx.mp.model;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.math.*;
import java.io.Serializable;
import lombok.Data;
/**
* 代码为自动生成 Created by www.magicalcoder.com
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:323237052
*/
@Data
public class User implements Serializable{

    private Integer userId;//userId
    private String userDesc;//userDesc
    private Byte gender;//0：女1：男2:未知
    private String tel;//tel
    private Integer msgNum;//msgNum
    private String label;//label
    private Byte userType;//个人/团体/管理员
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Timestamp createTime;//以后可能有用
    private Short attendDays;//以后拓展可能有用

    
    public Integer getUserId(){
        return userId;
    }
    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public String getUserDesc(){
        return userDesc;
    }
    public void setUserDesc(String userDesc){
        this.userDesc = userDesc;
    }

    public Byte getGender(){
        return gender;
    }
    public void setGender(Byte gender){
        this.gender = gender;
    }

    public String getTel(){
        return tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }

    public Integer getMsgNum(){
        return msgNum;
    }
    public void setMsgNum(Integer msgNum){
        this.msgNum = msgNum;
    }

    public String getLabel(){
        return label;
    }
    public void setLabel(String label){
        this.label = label;
    }

    public Byte getUserType(){
        return userType;
    }
    public void setUserType(Byte userType){
        this.userType = userType;
    }

    public Timestamp getCreateTime(){
        return createTime;
    }
    public void setCreateTime(Timestamp createTime){
        this.createTime = createTime;
    }

    public Short getAttendDays(){
        return attendDays;
    }
    public void setAttendDays(Short attendDays){
        this.attendDays = attendDays;
    }
}
