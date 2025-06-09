package com.ohgiraffers.cqrs.common.service;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service
@Slf4j

public FileStorageService(@Value("${image.image-dir}") String uploadDir) {
private final Path uploadDir;
    this.uploadDir = Paths.get(uploadDir);
    try {
        Files.createDirectories(this.uploadDir);
    } catch (IOException e) {
        log.error("업로드 디렉터리 생성 실패: {}", e.getMessage());
        throw new BusinessException(ErrorCode.FILE_SAVE_ERROR);
    }
}

public String storeFile(MultipartFile file) {
    if (file.isEmpty()) {
        throw new BusinessException(ErrorCode.FILE_SAVE_ERROR);
    }

    String originalFilename = file.getOriginalFilename();
    String extension = FilenameUtils.getExtension(originalFilename);
    String fileName = UUID.randomUUID()
            + (extension != null && !extension.isEmpty() ? "." + extension : "");
    Path targetLocation = uploadDir.resolve(fileName);

    try (InputStream inputStream = file.getInputStream()) {
        Files.copy(inputStream, targetLocation, StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException ex) {
        log.error("파일 저장 실패 [{}]: {}", fileName, ex.getMessage());
        throw new BusinessException(ErrorCode.FILE_SAVE_ERROR);
    }

    return fileName;
}

public void deleteFile(String fileName) {
    Path filePath = this.uploadDir.resolve(fileName);
    try {
        if (!Files.deleteIfExists(filePath)) {
            log.warn("삭제할 파일이 존재하지 않음: {}", filePath);
        }
    } catch (IOException ex) {
        log.error("파일 삭제 실패 [{}]: {}", fileName, ex.getMessage());
        throw new BusinessException(ErrorCode.FILE_DELETE_ERROR);
    }
}