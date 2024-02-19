package com.fuse.coffeemanagement.service;

import com.fuse.coffeemanagement.dao.ProductRepository;
import com.fuse.coffeemanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseService<Product, Long> {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    protected JpaRepository<Product, Long> repository() {
        return productRepository;
    }

}
