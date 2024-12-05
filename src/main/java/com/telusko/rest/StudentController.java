package com.telusko.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	List<Student> students=new ArrayList<>(List.of(new Student(1,"arjun",66),
			new Student(2,"arun",70),new Student(3,"agasthya",75)));
	
	@GetMapping("/getstudents")
	public List<Student> getStudents(){
		
		return students;
	}
	
	@PostMapping("/addstudent")
	public String addStudents(@RequestBody Student student){
		
		students.add(student);
		
		return "student added successfully";
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest request){
		
		return (CsrfToken) request.getAttribute("_csrf");
	}
}
