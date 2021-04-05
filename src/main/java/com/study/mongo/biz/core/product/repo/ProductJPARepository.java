package com.study.mongo.biz.core.product.repo;

import com.study.mongo.biz.core.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJPARepository extends JpaRepository<Product, Long>{
}
