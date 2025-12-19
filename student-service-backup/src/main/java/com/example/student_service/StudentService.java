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
	private RestTemplate restTemplate;
	
	public ResponseEntity<?> createStudent(Student student) {
		try {
			return new ResponseEntity<Student>(studentRepository.saveAndFlush(student),HttpStatus.OK);
			} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	public ResponseEntity<?> fetchStudentById(String id){
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent()) {
			School school = restTemplate.getForObject("http://SCHOOL-SERVICE/schools/"+student.get().getSchoolId(),School.class);
		StudentResponse studentResponse = new StudentResponse(
		student.get().getId(),
		student.get().getName(),
		student.get().getAge(),
		student.get().getGender(),
		school
		);
		return new ResponseEntity<StudentResponse>(studentResponse,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Student not found",HttpStatus.NOT_FOUND);
	
			
		
		}
	}
}