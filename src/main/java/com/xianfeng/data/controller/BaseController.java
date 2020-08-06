package com.xianfeng.data.controller;


import com.xianfeng.data.common.ApiResponse;

import java.util.function.Supplier;

import static com.xianfeng.data.enums.ResultCodeEnum.SUCCESS;


/**
 * @Name: BaseController
 */
public abstract class BaseController {

    protected ApiResponse ok() {
        return new ApiResponse(SUCCESS);
    }

    protected ApiResponse ok(VoidCallback callback) {
        callback.execute();
        return new ApiResponse(SUCCESS);
    }

    protected <T> ApiResponse<T> ok(Supplier<T> supplier) {
        return new ApiResponse<>(SUCCESS.getCode(), SUCCESS.getMsg(), supplier.get());
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
