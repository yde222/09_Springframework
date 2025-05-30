package com.ohgiraffers.fileupload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class FileDTO {

    private String originalFileName;
    private String savedFileName;
    private String filePath;
    private String fileDescription;
}
