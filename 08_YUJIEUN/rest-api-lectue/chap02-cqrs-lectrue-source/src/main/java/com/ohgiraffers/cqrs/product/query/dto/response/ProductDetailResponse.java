package com.ohgiraffers.cqrs.product.query.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDetailResponse {
    private  final  ProductDto productDto;
}
