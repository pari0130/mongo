package com.study.mongo.biz.comm.response.service;

import com.study.mongo.biz.comm.response.model.*;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ResponseService {

    // 단일건 결과를 처리하는 메소드
    <T> SingleResult<T> getSingleResult(T data);

    // 다중건 결과를 처리하는 메소드
    <T> ListResult<T> getListResult(List<T> list);

    // 다중건 결과를 처리하는 메소드
    <T> PageResult<T> getPageResult(Page<T> list);

    // 성공 결과만 처리하는 메소드
    CommonResult getSuccessResult();

    // 실패 결과만 처리하는 메소드
    CommonResult getFailResult(int code, String msg);

    // 로그인 후 토큰 발급 결과를 처리하는 메소드
    <T> TokenResult<T> getTokenResult(T token);
}
