package com.ohgiraffers.cqrs.products.query.service;

import com.ohgiraffers.cqrs.common.dto.Pagination;
import com.ohgiraffers.cqrs.exception.BusinessException;
import com.ohgiraffers.cqrs.exception.ErrorCode;
import com.ohgiraffers.cqrs.products.query.dto.request.ProductSearchRequest;
import com.ohgiraffers.cqrs.products.query.dto.response.ProductDetailResponse;
import com.ohgiraffers.cqrs.products.query.dto.response.ProductDto;
import com.ohgiraffers.cqrs.products.query.dto.response.ProductListResponse;
import com.ohgiraffers.cqrs.products.query.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductQueryService {

    private final ProductMapper productMapper;

    /***
     * 상품 상세 조회
     * @param productCode 상품코드
     * @return
     */
    @Transactional(readOnly = true)
    public ProductDetailResponse getProduct(Long productCode) {
        ProductDto product = Optional.ofNullable(
                productMapper.selectProductByCode(productCode)
        ).orElseThrow(() -> new BusinessException(ErrorCode.PRODUCT_NOT_FOUND));


        return ProductDetailResponse.builder().product(product).build();
    }

    /* 상품 목록 조회 */
    @Transactional(readOnly = true)
    public ProductListResponse getProducts(ProductSearchRequest productSearchRequest) {
        // 필요한 컨텐츠 조회
        List<ProductDto> products = productMapper.selectProducts(productSearchRequest);
        // 해당 검색 조건으로 총 몇개의 컨텐츠가 있는지 조회 (페이징을 위한 속성 값 계산이 필요)
        long totalItems = productMapper.countProducts(productSearchRequest);

        int page = productSearchRequest.getPage();
        int size = productSearchRequest.getSize();

        return ProductListResponse.builder()
                .products(products)
                .pagination(Pagination.builder()
                        .currentPage(page)
                        .totalPages((int) Math.ceil((double) totalItems / size))
                        .totalItems(totalItems)
                        .build())
                .build();
    }
}
