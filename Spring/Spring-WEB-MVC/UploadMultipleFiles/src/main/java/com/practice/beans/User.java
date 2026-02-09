package com.practice.beans;
import org.springframework.web.multipart.MultipartFile;

public class User {
	 private String name;
	 private String email;
	 MultipartFile resume;
	 MultipartFile profilePic;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 public MultipartFile getResume() {
		 return resume;
	 }
	 public void setResume(MultipartFile resume) {
		 this.resume = resume;
	 }
	 public MultipartFile getProfilePic() {
		 return profilePic;
	 }
	 public void setProfilePic(MultipartFile profiePic) {
		 this.profilePic = profiePic;
	 }
}
