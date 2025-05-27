package com.ohgiraffers.fileupload;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
public class FileUploadController {

    @Value("${spring.servlet.multipart.location}")
    private String filePath;

    @PostMapping("/single-file")
    public String singleFileUpload(
            @RequestParam String singleFileDescription,
            @RequestParam MultipartFile singleFile,
            Model model
            ){
        System.out.println("singleFileDescription = " + singleFileDescription);
        System.out.println("singleFile = " + singleFile);

        File dir = new File(filePath);
        if(!dir.exists()){// exists()는 폴더가 있는지 물어봄
            dir.mkdirs();
        }
        System.out.println("singleFile.getOriginalFilename() = " + singleFile.getOriginalFilename());
        String savedName = generateSavedFileName(singleFile);
        System.out.println("savedName = " + savedName);


        return "result";
    }

    @PostMapping("/multi-file"){
        public String multiFileUpload()
    }

    private String generateSavedFileName(MultipartFile file){
        String originFileName = file.getOriginalFilename();  // spring.svg
        String ext = originFileName.substring(originFileName.lastIndexOf("."));
         return UUID.randomUUID().toString().replace("-","") + ext;
    }
}
