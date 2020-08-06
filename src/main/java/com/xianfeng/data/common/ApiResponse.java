package com.xianfeng.data.common;

import com.xianfeng.data.enums.ResultCodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description 返回封装类
 * @Author xianfeng
 * @Date 2020/7/24 14:26
 * @Version 1.0
 */
@Data
public class ApiResponse<T> implements Serializable {

    /**
     * 状态码
     */
    private int code = 0;

    /**ResultCodeEnum
     * 返回消息
     */
    private String result = "SUCCESS";

    /**
     * 返回对象
     */
    private T object;

    public ApiResponse() {

    }

    public ApiResponse(ResultCodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.result = codeEnum.getMsg();
    }

    public ApiResponse(int code, String result, T data) {
        this.code = code;
        this.result = result;
        this.object = data;
    }
}
