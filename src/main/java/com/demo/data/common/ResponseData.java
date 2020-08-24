package com.demo.data.common;

import com.demo.data.enums.ResultCodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Brt
 * @Date: 2019/12/24
 * @Name: ResponseData
 */
@Data
public class ResponseData<T> implements Serializable {

    private static final long serialVersionUID = 7565610624437704026L;

    private int code;

    private String message;

    private T data;

    public ResponseData() {

    }

    public ResponseData(ResultCodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMsg();
    }
    
    public ResponseData(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
