package com.example.student_service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
    private SchoolClient schoolClient;
	 public ResponseEntity<?> createStudent(Student student){
	        try{
	            return new ResponseEntity<Student>(studentRepository.saveAndFlush(student), HttpStatus.OK);
	        }catch(Exception e){
	            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	 public ResponseEntity<?> fetchStudentById(Long id){
	        Optional<Student> optionalStudent  =  studentRepository.findById(id);
	        if (optionalStudent.isEmpty()) {
	            return new ResponseEntity<>("No Student Found", HttpStatus.NOT_FOUND);
	        }
			
	    Student student=    optionalStudent.get();
	    // 🔗 Feign call instead of RestTemplate
	   School school= schoolClient.getSchoolById(student.getSchoolId());
	    
	   StudentResponse studentResponse = new StudentResponse(
               student.getId(),
               student.getName(),
               student.getAge(),
               student.getGender(),
               school
       );
	  return new ResponseEntity<>(studentResponse, HttpStatus.OK);

	        
	     
	         
	    }
	 
	 
	 
	
}
