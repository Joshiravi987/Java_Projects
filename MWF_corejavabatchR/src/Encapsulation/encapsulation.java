package Encapsulation;
//hide business logic from the user/implementation details
// show essential/functionality features to the user
//wrapping data and methods into a single unit
//and protect it from outside interference/world and misuse
//data hiding
//Encapsulation is a fundamental concept in object-oriented programming (OOP) that allows you to bundle data (attributes) and methods (functions) that operate on that data into a single unit, known as a class. It restricts direct access to some of an object's components, which can prevent the accidental modification of data. Encapsulation helps in maintaining the integrity of the data and provides a clear interface for interacting with the object.
public class encapsulation {
private int id; 
private String name,emailId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
@Override
public String toString() {
	return "encapsulation [id=" + id + ", name=" + name + ", emailId=" + emailId + "]";
}

}
