package com.demo.data.controller;


import com.demo.data.common.ApiResponse;
import com.demo.data.enums.ResultCodeEnum;

import java.util.function.Supplier;


/**
 * @Name: BaseController
 */
public abstract class BaseController {

    protected ApiResponse ok() {
        return new ApiResponse(ResultCodeEnum.SUCCESS);
    }

    protected ApiResponse ok(VoidCallback callback) {
        callback.execute();
        return new ApiResponse(ResultCodeEnum.SUCCESS);
    }

    protected <T> ApiResponse<T> ok(Supplier<T> supplier) {
        return new ApiResponse<>(ResultCodeEnum.SUCCESS.getCode(), ResultCodeEnum.SUCCESS.getMsg(), supplier.get());
    }

    /**
     * 回调方法
     */
    interface VoidCallback {
        /**
         * 执行回调
         */
        void execute();
    }
}
