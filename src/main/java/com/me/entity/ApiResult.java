/**
 * Copyright(C) 2019 maybe. All rights reserved
 *
 * @author maybe
 * @date 2019/6/7
 * @time 14:58
 * @description
 */
package com.me.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult {

    private static final int ERROR_CODE_SUCCESS = 0;
    private static final int ERROR_CODE_SERVER_INTERNAL_ERROR = -1;
    private static final int ERROR_CODE_INVALID_PARAM = -2;

    public static final ApiResult SUCCESS = new ApiResult(null);
    public static final ApiResult SERVER_INTERNAL_ERROR = new ApiResult(ERROR_CODE_SERVER_INTERNAL_ERROR, null);
    public static final ApiResult INVALID_PARAM = new ApiResult(ERROR_CODE_INVALID_PARAM, null);

    private int errorCode;

    private Object result;

    public ApiResult(Object result) {
        errorCode = ERROR_CODE_SUCCESS;
        this.result = result;
    }
}
