package com.study.mongo.biz.comm.response.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenResult<T> extends CommonResult {
    private T token;
}
