package com.itany.zshop.common.util;

import com.itany.zshop.common.constant.ResponseStatusConstant;

public class ResponseResult {
    //响应状态
    private  int status;
    //消息
    private String message;
    //返回数据
    private Object date;

    public  ResponseResult(int status, String message, Object date) {
        this.status = status;
        this.message = message;
        this.date = date;
    }
    //成功的方法
    //成功
    public static ResponseResult success(Object data){
        return new ResponseResult(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS,"success",data);
    }
    public static ResponseResult success(){
        return new ResponseResult(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS,"success",null);
    }
    public static ResponseResult message(String message){
        return new ResponseResult(ResponseStatusConstant.RESPONSE_STATUS_SUCCESS,message,null);
    }
    //失败
    public static ResponseResult fal(){
        return new ResponseResult(ResponseStatusConstant.RESPONSE_STATUS_FAILSE,"false",null);
    }
    public static ResponseResult fal(String message){
        return new ResponseResult(ResponseStatusConstant.RESPONSE_STATUS_FAILSE,message,null);
    }
    public ResponseResult() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
