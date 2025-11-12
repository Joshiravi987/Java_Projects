package com.phone;

import com.person.Person;

public class Phone {
private int phoneModelno;
private String phoneName;
private int phoneStorage;

private Person person; //DI

public int getPhoneModelno() {
	return phoneModelno;
}

public void setPhoneModelno(int phoneModelno) {
	this.phoneModelno = phoneModelno;
}

public String getPhoneName() {
	return phoneName;
}

public void setPhoneName(String phoneName) {
	this.phoneName = phoneName;
}

public int getPhoneStorage() {
	return phoneStorage;
}

public void setPhoneStorage(int phoneStorage) {
	this.phoneStorage = phoneStorage;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}
public void showPersonDetails() {
	System.out.println("Person Details:");
	System.out.println("ID: "+ person.getPerson_id());
	System.out.println("Name: "+ person.getPerson_name());
	System.out.println("Mobile: "+ person.getPerson_mobile());
}

}
