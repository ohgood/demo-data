package com.demo.data.bo;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @Author: Brt
 * @Date: 2019/12/24
 * @Name: ResultCodeEnum
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ResultCodeEnum {

    /**
     * 成功
     */
    SUCCESS(0, "success"),

    /**
     * 发生熔断
     */
    MESSAGE_SEND_HYSTRIX(1, "服务器内部错误"),

    /**
     * 用户没有广告主账号权限
     */
    NO_AUTHORITY(2, "无权限，请联系管理员添加权限"),

    /**
     * 获取钉钉用户信息失败
     */
    USER_INFO_FAIL(3, "获取钉钉用户信息失败"),

    /**
     * 传入参数不正确
     */
    PARAMETER_ERROR(4, "参数不正确"),


    /**
     * 未定义异常信息
     */
    UNDEFINE(-1, "未定义异常信息");

    private int code;

    private String msg;

    ResultCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
