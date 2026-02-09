package com.practice.controllers;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.practice.beans.User;

@Controller
public class MyController {

    @GetMapping("/uploadFilePage")
    public String openUploadFilePage() {
        return "upload-file";
    }

    @PostMapping("/uploadFile")
    public String uploadFile( @ModelAttribute("user") User user, Model model) {
    	String name=user.getName();
    	String email=user.getEmail();
    	MultipartFile resume=user.getResume();
    	MultipartFile profilePic=user.getProfilePic();
    	
    	
    	
    	String resumeStatus;
    	try {
    		String fileName=resume.getOriginalFilename();
    		byte[] fileInBytes=resume.getBytes();
    		FileOutputStream fos=new FileOutputStream("D:\\temp\\"+fileName);
    		fos.write(fileInBytes);
    		resumeStatus="resume Uploaded Successfully";
    	}
    	catch(Exception e) {
    		resumeStatus="resume not uploaded sue to some failure";
    		e.printStackTrace();
    	}
    	
    	 
    	
    	String profileStatus;
    	try {
    		String fileName=profilePic.getOriginalFilename();
    		byte[] fileInBytes=profilePic.getBytes();
    		FileOutputStream fos=new FileOutputStream("D:\\temp\\"+fileName);
    		fos.write(fileInBytes);
    		profileStatus="Profile Uploaded Successfully";
    	}
    	catch(Exception e) {
    		profileStatus="Profile not uploaded sue to some failure";
    		e.printStackTrace();
    	}
    			
    	
    	
    	model.addAttribute("profile_status", profileStatus);
    	model.addAttribute("resume_status", resumeStatus);
    	model.addAttribute("name", name);
    	model.addAttribute("email", email);
        return "status";
    }
}
