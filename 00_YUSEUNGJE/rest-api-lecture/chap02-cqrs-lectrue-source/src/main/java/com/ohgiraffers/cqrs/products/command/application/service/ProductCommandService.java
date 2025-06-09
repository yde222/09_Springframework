package com.ohgiraffers.cqrs.products.command.application.service;

import com.ohgiraffers.cqrs.common.service.FileStorageService;
import com.ohgiraffers.cqrs.products.command.application.dto.request.ProductCreateRequest;
import com.ohgiraffers.cqrs.products.command.domain.aggregate.Product;
import com.ohgiraffers.cqrs.products.command.domain.respository.ProductRepository;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ProductCommandService {

    private final ProductRepository productRepository;
    private final FileStorageService fileStorageService;
    private final ModelMapper modelMapper;

    @Value("${image.image-url}")
    private String IMAGE_URL;

    /***
     * 상품등록
     * @param productCreateRequest
     * @param productImg
     * @return
     */
    @Transactional
    public Long createProduct(ProductCreateRequest productCreateRequest, MultipartFile productImg) {
        // 1. File 저장 => FileStorageService를 이용
        String replaceFileName = fileStorageService.storeFile(productImg);

        // 2. DTO -> Entity 변환
        Product newProduct = modelMapper.map(productCreateRequest, Product.class);
        newProduct.changeProductImageUrl(IMAGE_URL + replaceFileName);
        // 3. productRepository entity save
        Product product = productRepository.save(newProduct);

        return product.getProductCode();
    }
}
