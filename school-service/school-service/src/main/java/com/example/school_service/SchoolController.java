package com.example.school_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/school")
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
	public List<School> fetchSchools()
	{
		return schoolService.fetchSchool();
	}
	@GetMapping("/{id}")
	public School fetchSchoolById(@PathVariable int id)
	{ return schoolService.fetchSchoolById(id);
	}
}