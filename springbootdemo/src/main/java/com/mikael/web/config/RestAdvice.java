package com.mikael.web.config;

import com.mikael.web.utils.exception.DefineException;
import com.mikael.web.utils.respon.ServiceResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestAdvice {

    @ExceptionHandler(DefineException.class)
    public ServiceResult handleException(DefineException e) {
        return new ServiceResult(999999, e.getMessage(), null);
    }

}
