package com.github.mju.schoolActivity.wx.mp.model;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.*;
import java.io.Serializable;
import lombok.Data;
/**
* 代码为自动生成 Created by www.magicalcoder.com
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:323237052
*/
@Data
public class UserActivity implements Serializable{

    private Integer id;//id
    private Integer userId;//userId
    private Integer actiyityId;//actiyityId
    private Byte relationship;//relationship
    private Byte isPush;//isPush

    
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public Integer getUserId(){
        return userId;
    }
    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getActiyityId(){
        return actiyityId;
    }
    public void setActiyityId(Integer actiyityId){
        this.actiyityId = actiyityId;
    }

    public Byte getRelationship(){
        return relationship;
    }
    public void setRelationship(Byte relationship){
        this.relationship = relationship;
    }

    public Byte getIsPush(){
        return isPush;
    }
    public void setIsPush(Byte isPush){
        this.isPush = isPush;
    }
}
