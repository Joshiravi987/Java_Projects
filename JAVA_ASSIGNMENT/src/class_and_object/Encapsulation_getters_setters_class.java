package class_and_object;

public class Encapsulation_getters_setters_class {
    // Private fields (data hiding)
    private String name;
    private int age;
    private double salary;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // simple validation
            this.age = age;
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: ₹" + salary);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Encapsulation_getters_setters_class emp = new Encapsulation_getters_setters_class();

        // Setting values using setters
        emp.setName("Ravi Joshi");
        emp.setAge(28);
        emp.setSalary(900000);

        // Displaying values using getters
        emp.displayInfo();
    }
}
