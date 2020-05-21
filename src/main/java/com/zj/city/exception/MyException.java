package com.zj.city.exception;
/*
 * 功能描述: 建立自定义异常类 -- 继承运行异常最高类
 *
 * */

/**
 * 自定制异常类
 *
 * @author MoCha
 * @date 2019/5/25
 */
public class MyException extends RuntimeException {
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MyException(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
