package object_oriented_programming_concept;
class Animal{
	void sound() {
		System.out.println("Animal makes a sound ");
	}
}
class Lion extends Animal{
	void sound() {
		System.out.println("Lion roars");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat meows");
	}
}
public class polymorphism {
public static void main(String[] args) {
	Animal a;
	a = new Lion();
	a.sound();
	a = new Cat();
	a.sound();
			}
}
