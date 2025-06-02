package com.ohgiraffers.fileupload;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FileDTO {

    private String originFileName;
    private String savedFileName;
    private String filePath;
    private String fileDescription;
}
