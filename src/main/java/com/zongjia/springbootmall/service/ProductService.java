package com.zongjia.springbootmall.service;

import com.zongjia.springbootmall.dto.ProductRequest;
import com.zongjia.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
