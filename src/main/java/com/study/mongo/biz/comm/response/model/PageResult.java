package com.study.mongo.biz.comm.response.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
public class PageResult<T> extends CommonResult {
    private Page<T> list;
}
