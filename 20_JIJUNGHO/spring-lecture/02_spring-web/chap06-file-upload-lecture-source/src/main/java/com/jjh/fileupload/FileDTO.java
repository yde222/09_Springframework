package com.jjh.fileupload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class FileDTO {
    private String originFileName;
    private String savedFileName;
    private String filePath;
    private String fileDescription;

}
