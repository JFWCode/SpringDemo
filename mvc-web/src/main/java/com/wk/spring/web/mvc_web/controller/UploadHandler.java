package com.wk.spring.web.mvc_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadHandler {

    @RequestMapping(value = "/testUpload", method = RequestMethod.GET)
    public String testUpload(HttpServletRequest request, @CookieValue("JSESSIONID") String cookie) {
        return "upload";
    }

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFile(@RequestParam(required = true, name = "file") MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();

        String userDir = this.getClass().getResource("/").getPath();
        File saveTo = new File(userDir + "/" + filename);

        System.out.println(saveTo.getAbsolutePath());
        file.transferTo(saveTo);
        return "success";
    }

    @RequestMapping(value = "/uploadMultiFiles", method = RequestMethod.POST)
    public String uploadMultiFile(@RequestParam(required = true, name = "files") MultipartFile[] files) throws IOException {
        String userDir = this.getClass().getResource("/").getPath();
        for (MultipartFile file: files) {
            File saveTo = new File(userDir + "/" + file.getOriginalFilename());

            System.out.println(saveTo.getAbsolutePath());
            file.transferTo(saveTo);
        }

        return "success";
    }
}
