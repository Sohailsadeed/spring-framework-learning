package com.practice.controllers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyController {

    @GetMapping("/downloadFilePage")
    public String openUploadFilePage() {
        return "download-file";
    }

    @PostMapping("/downloadFile")
    public void downloadFile(HttpServletResponse resp) {
        
        try {
        	resp.setContentType("application/octet-stream");
        	File file=new File("D:\\temp\\itachiu.jpeg");
        	FileInputStream fis=new FileInputStream(file);
			resp.setHeader("content-disposition","attachment;filename=\""+file.getName()+"\"");
			resp.setContentLength((int)file.length());
			OutputStream os= resp.getOutputStream();
			InputStream is=new BufferedInputStream(fis);
			
			FileCopyUtils.copy(is, os);
		} 
        catch (Exception e) {
			
			e.printStackTrace();
		}
        
    }
}
