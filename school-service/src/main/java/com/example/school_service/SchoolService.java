package com.example.school_service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	public ResponseEntity<?> fetchAllSchool() {
		// TODO Auto-generated method stub
		try {
			return new ResponseEntity<> (schoolRepository.findAll(),HttpStatus.OK);
			
		}
		catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

		}
			}

	public void deleteSchoolById(Integer id) {
		// TODO Auto-generated method stub
		schoolRepository.deleteById(id);
	}
	public School updateSchool(Integer id, School updatedSchoolData) 

	{

		Optional<School> existingSchoolOptional = schoolRepository.findById(id);

        if (existingSchoolOptional.isPresent()) 

        {

            School existingSchool = existingSchoolOptional.get();

            existingSchool.setSchoolName(updatedSchoolData.getSchoolName());

            existingSchool.setPrincipalName(updatedSchoolData.getPrincipalName());

            existingSchool.setLocation(updatedSchoolData.getLocation());

            return schoolRepository.save(existingSchool);

        } 

        else 

        {

            throw new RuntimeException("School not found with ID: " + id); 

        }

    }
	
	
}