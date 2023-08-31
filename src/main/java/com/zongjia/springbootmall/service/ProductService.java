package com.zongjia.springbootmall.service;

import com.zongjia.springbootmall.dto.ProductQueryParams;
import com.zongjia.springbootmall.dto.ProductRequest;
import com.zongjia.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
