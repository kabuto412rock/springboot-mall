package com.zongjia.springbootmall.dao;

import com.zongjia.springbootmall.constant.ProductCategory;
import com.zongjia.springbootmall.dto.ProductQueryParams;
import com.zongjia.springbootmall.dto.ProductRequest;
import com.zongjia.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
