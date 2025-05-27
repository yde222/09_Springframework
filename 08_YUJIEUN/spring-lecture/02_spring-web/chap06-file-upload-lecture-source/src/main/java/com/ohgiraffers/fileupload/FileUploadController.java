package com.ohgiraffers.fileupload;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class FileUploadController {

    @Value("${spring.servlet.multipart.location")
    private String filePath;

    @PostMapping("/single-file")
    public String singleFileUpload(@RequestParm String singleFileDescription, @RequestParam MultipartFile singleFile, Model model) {
        System.out.println("singleFileDescription: " + singleFileDescription);
        System.out.println("singleFile: " + singleFile);

        File dir = new File(filePath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        System.out.println("singleFile.getOriginalFilename(): " + singleFile.getOriginalFilename());

    }

    public String gener

}



