package com.ohgiraffers.cqrs.products.command.application.service;

import com.ohgiraffers.cqrs.products.command.application.dto.request.ProductCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ProductCommandService {

    public Long createProduct(ProductCreateRequest productCreateRequest, MultipartFile productImg) {
        return 0L;
    }
}
