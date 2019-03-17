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
public class Activities implements Serializable{

    private Integer activityId;//activityId
    private Byte activityType;//活动类型;0大型活动,1自发活动
    private String activityDesc;//activityDesc
    private Integer participantsNum;//participantsNum
    private Byte status;//活动状态:0未开始1正在进行2已经结束
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Timestamp starttime;//starttime
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Timestamp endtime;//endtime
    private Integer limitNum;//限制人数;0为无限制
    private Integer initiatorId;//initiatorId
    private String place;//place
    private Integer startupNum;//startupNum

    
    public Integer getActivityId(){
        return activityId;
    }
    public void setActivityId(Integer activityId){
        this.activityId = activityId;
    }

    public Byte getActivityType(){
        return activityType;
    }
    public void setActivityType(Byte activityType){
        this.activityType = activityType;
    }

    public String getActivityDesc(){
        return activityDesc;
    }
    public void setActivityDesc(String activityDesc){
        this.activityDesc = activityDesc;
    }

    public Integer getParticipantsNum(){
        return participantsNum;
    }
    public void setParticipantsNum(Integer participantsNum){
        this.participantsNum = participantsNum;
    }

    public Byte getStatus(){
        return status;
    }
    public void setStatus(Byte status){
        this.status = status;
    }

    public Timestamp getStarttime(){
        return starttime;
    }
    public void setStarttime(Timestamp starttime){
        this.starttime = starttime;
    }

    public Timestamp getEndtime(){
        return endtime;
    }
    public void setEndtime(Timestamp endtime){
        this.endtime = endtime;
    }

    public Integer getLimitNum(){
        return limitNum;
    }
    public void setLimitNum(Integer limitNum){
        this.limitNum = limitNum;
    }

    public Integer getInitiatorId(){
        return initiatorId;
    }
    public void setInitiatorId(Integer initiatorId){
        this.initiatorId = initiatorId;
    }

    public String getPlace(){
        return place;
    }
    public void setPlace(String place){
        this.place = place;
    }

    public Integer getStartupNum(){
        return startupNum;
    }
    public void setStartupNum(Integer startupNum){
        this.startupNum = startupNum;
    }
}
