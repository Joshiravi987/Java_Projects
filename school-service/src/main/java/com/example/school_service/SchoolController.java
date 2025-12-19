package com.example.school_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/schools")
public class SchoolController 
{
	@Autowired
	private SchoolService schoolService;
	
	@PostMapping
	public ResponseEntity<School> addSchool(@RequestBody School school)
	{
		School sc=schoolService.addSchool(school);
		return ResponseEntity.ok(sc);
	}
	
	
	@GetMapping
	public ResponseEntity<?> fetchAllSchool(){
		return schoolService.fetchAllSchool();
	}
	
	@GetMapping("/{id}")
	public School fetchSchoolById(@PathVariable int id)
	{ return schoolService.fetchSchoolById(id);
	}
	@DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSchool(@PathVariable Integer id)
{
        schoolService.deleteSchoolById(id);    
        return new ResponseEntity<>("School with ID " + id + " deleted successfully.", HttpStatus.NO_CONTENT);
    }

@PutMapping("/{id}")
    public ResponseEntity<School> updateSchool(@PathVariable Integer id,@RequestBody School updatedSchool)
{
        School school = schoolService.updateSchool(id, updatedSchool);
        return new ResponseEntity<>(school, HttpStatus.OK);
    }
}