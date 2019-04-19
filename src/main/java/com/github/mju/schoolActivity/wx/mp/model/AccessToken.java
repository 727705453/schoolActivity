package com.github.mju.schoolActivity.wx.mp.model;

import java.io.Serializable;
import java.util.Date;

public class AccessToken implements Serializable {
    private String redisKey;
    private Date createAt;
    private String accessToken;
    //过期时间
    private Date expireAt;

    public String getRedisKey() {
        return redisKey;
    }

    public void setRedisKey(String redisKey) {
        this.redisKey = redisKey;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Date expireAt) {
        this.expireAt = expireAt;
    }

    @Override
    public String toString() {
        return "AccessToken{" +
            "redisKey='" + redisKey + '\'' +
            ", createAt=" + createAt +
            ", accessToken='" + accessToken + '\'' +
            ", expireAt=" + expireAt +
            '}';
    }
}
