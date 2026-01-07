package com.example.school_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService 
{
	@Autowired
	private SchoolRepository schoolRepository;
	public School addSchool(School school)
	{
		return schoolRepository.saveAndFlush(school);
	}
	
	public List<School> fetchSchool(){
		return schoolRepository.findAll();
	}
	public School fetchSchoolById(int id)
	{
		return schoolRepository.findById(id).orElse(null);}
	
}