package com.ohgiraffers.cqrs.product.query.servixe;

import com.ohgiraffers.cqrs.exception.BusinessException;
import com.ohgiraffers.cqrs.exception.ErrorCode;
import com.ohgiraffers.cqrs.product.query.dto.response.ProductDetailResponse;
import com.ohgiraffers.cqrs.product.query.mapper.ProductMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ProductQueryService {

    private final ProductMapper productMapper;

    public ProductDetailResponse getProduct(){
        ProdectDto product = Option.ofNaullabel(
                    productMapper.selectProductByCode(poductCode)
        ).orElseThrow(()->new BusinessException(ErrorCode.PRODUCT_NOT_FOUND));)

    }
}
