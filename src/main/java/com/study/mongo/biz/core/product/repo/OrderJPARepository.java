package com.study.mongo.biz.core.product.repo;

import com.study.mongo.biz.core.product.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJPARepository extends JpaRepository<Order, Long>{
}
