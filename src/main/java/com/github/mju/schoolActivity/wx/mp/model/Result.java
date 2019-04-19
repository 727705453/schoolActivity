package com.github.mju.schoolActivity.wx.mp.model;

import java.util.HashMap;
import java.util.Map;

public class Result {

    public static final Integer SUCCESS = 2000;
    public static final Integer ERROR = 2001;
    public static final Integer ACCESSERROR = 2003;   //权限不足
    public static final Integer REPERROR = 2004; //操作重复

    private boolean flag;
    private Integer code;
    private String message;
    private Map<String, Object> data;

    public Result() {
    }

    public Result(boolean flag, Integer code, String message) {
        super();
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(boolean flag, Integer code, String message, Map<String, Object> data) {
        super();
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    /**
     * 返回成功消息
     *
     * @return Result
     */
    public static Result success() {
        return new Result(true, SUCCESS, "成功");
    }

    /**
     * 返回失败消息
     *
     * @return Result
     */
    public static Result error() {
        return new Result(true, ERROR, "失败");
    }


    /**
     * 返回权限不足
     *
     * @return Result
     */
    public static Result accessError() {
        return new Result(true, ACCESSERROR, "权限不足");
    }


    /**
     * 返回重复操作
     *
     * @return Result
     */
    public static Result repError() {
        return new Result(true, REPERROR, "重复操作");
    }

    public Result addData(String key, Object value) {
        if (data == null) {
            data = new HashMap<>();
        } else {
            data.put(key, value);
        }
        return this;
    }
}
