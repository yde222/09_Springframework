package com.ohgiraffers.cqrs.products.command.application.service;

import com.ohgiraffers.cqrs.common.service.FileStorageService;
import com.ohgiraffers.cqrs.products.command.application.dto.request.ProductCreateRequest;
import com.ohgiraffers.cqrs.products.command.domain.respository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ProductCommandService {

    private final ProductRepository
    private final FileStorageService fileStorageService;
    private final ModelMapper modelMapper;

    @Value("${image.image-url")
    private

    @Transactional
    public Long createProduct(ProductCreateRequest productCreateRequest, MultipartFile productImg) {

        String replaceFileNam = fileStorageService.
    }
}
