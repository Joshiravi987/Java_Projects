package inheritance;
import java.util.Scanner;
class EmployeeName {
    int size;
    Scanner scn = new Scanner(System.in);
    String name[];
public EmployeeName() {
        System.out.print("Enter number of employees: ");
        size = scn.nextInt();
        name = new String[size];
        System.out.println("Enter names of " + size + " employees:");
        for (int i = 0; i < size; i++) {
            name[i] = scn.next();
        }
    }
 void display() {
        System.out.println("Employee Names:");
        for (int i = 0; i < size; i++) {
            System.out.println("Name: " + name[i]);
        }
    }
}
class EmployeeSalary extends EmployeeName {
    int salary[];
    String position[];
public EmployeeSalary() {
        salary = new int[size];
        position = new String[size];
        System.out.println("Enter position for each employee (fresher / experience / manager / other):");
        for (int i = 0; i < size; i++) {
            System.out.print("Position for " + name[i] + ": ");
            position[i] = scn.next();
            if (position[i].equalsIgnoreCase("fresher")) {
                salary[i] = 25000;
            } else if (position[i].equalsIgnoreCase("experience")) {
                salary[i] = 55000;
            } else if (position[i].equalsIgnoreCase("manager")) {
                salary[i] = 80000;
            } else {
                salary[i] = 15000;
            }
        }
    }

    void display() {
        super.display();
        System.out.println("Employee Salary Details:");
        for (int i = 0; i < size; i++) {
            System.out.println("Name: " + name[i] + "\t  Position: " + position[i] + "\tSalary: ₹" + salary[i]);
        }
    }
}
public class employee_detail_inheritance {
    public static void main(String[] args) {
        EmployeeSalary emp = new EmployeeSalary();
        emp.display();
    }
}
