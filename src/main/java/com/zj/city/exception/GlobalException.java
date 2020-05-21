package com.zj.city.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常处理
 *
 * @author MoCha
 * @date 2019/5/25
 */
@ControllerAdvice
public class GlobalException {
    @ResponseBody
    @ExceptionHandler(MyException.class)
    public Map<String, Object> handleCustomException(MyException customException) {
        Map<String, Object> errorResultMap = new HashMap<>(16);
        errorResultMap.put("code", customException.getCode());
        errorResultMap.put("message", customException.getMessage());
        return errorResultMap;
    }
}

