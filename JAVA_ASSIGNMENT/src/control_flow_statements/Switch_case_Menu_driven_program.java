package control_flow_statements;

public class Switch_case_Menu_driven_program {
	// A simple menu-driven program using switch-case statement

	public static void main(String[] args) {
		int choice = 2; // Example choice, can be changed to test different cases

		switch (choice) {
		case 1:
			System.out.println("VADAPAV is selected.");
			break;
		case 2:
			System.out.println("DAHIVADA is selected.");
			break;
		case 3:
			System.out.println("DOSA is selected.");
			break;
		case 4:
			System.out.println("IDLI is selected.");
			break;
		case 5:
			System.out.println("POHA is selected.");
			break;

		default:
			System.out.println("Invalid choice. Please select a valid option.");
			break;
		}
	}

}
