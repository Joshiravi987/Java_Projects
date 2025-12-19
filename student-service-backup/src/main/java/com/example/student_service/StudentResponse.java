
package com.example.student_service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

	
	private String id;
	private String name;
	private int age;
	private String gender;
	private School school;
}
