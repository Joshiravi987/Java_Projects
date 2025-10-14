package com.model;

public class User {

private int id;
private String Username, Password, Email, Phone;
private byte[] Photo; // Now correctly defined once

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
// *** Correct BLOB Accessor Methods ***
public byte[] getPhoto() {
    return Photo;
}
public void setPhoto(byte[] Photo) {
    this.Photo = Photo;
}
}