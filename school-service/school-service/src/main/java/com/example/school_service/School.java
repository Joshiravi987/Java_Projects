package com.example.school_service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class School 
{
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String schoolName;
	@Column
	private String location;
	@Column
	private String principalName;
}