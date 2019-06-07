/**
 * Copyright(C) 2019 maybe. All rights reserved
 *
 * @author maybe
 * @date 2019/6/7
 * @time 15:14
 * @description
 */
package com.me.web;

import com.me.entity.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public ApiResult ServerInternalError(Exception e) {
        log.info("{}, {}, {}", e.getClass(), e.getMessage(), e.getCause());
        return ApiResult.SERVER_INTERNAL_ERROR;
    }
}
