package com.ohgiraffers.cqrs.products.command.domain.respository;

import com.ohgiraffers.cqrs.products.command.domain.aggregate.Product;

public interface ProductRepository {
    Product save(Product newProduct);
}
