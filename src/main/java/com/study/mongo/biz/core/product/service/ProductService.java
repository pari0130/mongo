package com.study.mongo.biz.core.product.service;

import com.study.mongo.biz.core.product.dto.OrderDto;
import com.study.mongo.biz.core.product.dto.ProductDto;
import com.study.mongo.biz.core.product.entity.Order;
import com.study.mongo.biz.core.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    /**
     * @Purpose : 제품 정보 저장
     * @Method Name : insertProduct
     * @Author : 조동휘
     * @Date : 2021-04-03
     * @param dto : 제품 상세 정보 데이터
     * @Return : Product
     * @Description
     */
    Product insertProduct(ProductDto dto);

    /**
     * @Purpose : 제품 전체 목록 조회
     * @Method Name : selectListProduct
     * @Author : 조동휘
     * @Date : 2021-04-03
     * @Return : Page<ProductDto>
     * @Description
     */
    Page<ProductDto> selectListProduct(Pageable pageable);

    /**
     * @Purpose : 사용자가 제품 주문
     * @Method Name : insertOrder
     * @Author : 조동휘
     * @Date : 2021-04-03
     * @param dto : 제품 주문 시 전달받은 제품 번호
     * @Return : OrderDto.Res
     * @Description
     */
    Order insertOrder(OrderDto.Req dto);

    /**
     * @Purpose : 단일 회원의 주문 목록 조회
     * @Method Name : selectListOrder
     * @Author : 조동휘
     * @Date : 2021-04-03
     * @param dto : 주문 목록 조회시 사용할 회원번호
     * @Return : List<OrderDto.Res>
     * @Description
     */
    List<OrderDto.Res> selectListOrder(OrderDto.Req dto);

    /**
     * @Purpose : 여러 회원의 주문 목록 조회
     * @Method Name : selectPageUserOrder
     * @Author : 조동휘
     * @Date : 2021-04-03
     * @param pageable : 페이징 기능 처리
     * @param dto : 일자, 이름, 이메일 등 검색 기능 처리
     * @Return : Page<OrderDto.UserOrderRes>
     * @Description
     */
    Page<OrderDto.UserOrderRes> selectPageUserOrder(Pageable pageable, OrderDto.UserOrderReq dto);
}
