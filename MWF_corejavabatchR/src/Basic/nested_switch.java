package Basic;

import java.util.Scanner;

public class nested_switch {
	public static void main(String[] args) {
		String branch;
		int semester;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter branch");
		branch = scn.next();
		System.out.println("enter semester");
		semester = scn.nextInt();
		switch (branch) {
		case "CSE":
			switch (semester) {
			case 1:
				System.out.println("CSE 1st semester subjects: Mathematics, Physics, Chemistry");
				break;
			case 2:
				System.out.println(
						"CSE 2nd semester subjects: Data Structures, Computer Organization, Discrete Mathematics");
				break;
			case 3:
				System.out.println(
						"CSE 3rd semester subjects: Operating Systems, Database Management Systems, Software Engineering");
				break;
			case 4:
				System.out.println(
						"CSE 4th semester subjects: Computer Networks, Theory of Computation, Web Technologies");
				break;
			case 5:
				System.out.println(
						"CSE 5th semester subjects: Object Oriented Programming, Mobile Application Development, Cloud Computing");
				break;
			case 6:
				System.out.println(
						"CSE 6th semester subjects: Machine Learning, Artificial Intelligence, Cyber Security");
				break;
			case 7:
				System.out.println(
						"CSE 7th semester subjects: Big Data Analytics, Internet of Things, Blockchain Technology");
				break;
			case 8:
				System.out.println(
						"CSE 8th semester subjects: Capstone Project, Advanced Topics in Computer Science, Professional Ethics");
				break;
			default:
				System.out.println("Invalid semester for CSE");
				break;
			}
			break;
		case "IT":
			switch (semester) {
			case 1:
				System.out.println("" + "IT 1st semester subjects: Mathematics_IT, Physics_IT, Chemistry");
				break;
			case 2:
				System.out.println(
						"IT 2nd semester subjects: Data Structures_IT, Computer Organization_It, Discrete Mathematics_IT");
				break;
			case 3:
				System.out.println(
						"IT 3rd semester subjects: Operating Systems_IT, Database Management Systems_IT, Software Engineering_IT");
			case 4:
				System.out.println(
						"IT 4th semester subjects: Computer Networks_IT, Theory of Computation_IT, Web Technologies_IT");
				break;
			case 5:
				System.out.println(
						"IT 5th semester subjects: Object Oriented Programming_IT, Mobile Application Development_IT, Cloud Computing_IT");
				break;
			case 6:
				System.out.println(
						"IT 6th semester subjects: Machine Learning_IT, Artificial Intelligence_IT, Cyber Security_IT");
				break;
			case 7:
				System.out.println(
						"IT 7th semester subjects: Big Data Analytics_IT, Internet of Things_IT, Blockchain Technology_IT");
				break;
			case 8:
				System.out.println(
						"IT 8th semester subjects: Capstone Project_IT, Advanced Topics in Computer Science_IT, Professional Ethics_IT");
				break;
			default:
				System.out.println("Invalid semester for IT");
				break;
			}
		case "EC":
			switch (semester) {
			case 1:
				System.out.println("ECE 1st semester subjects: Mathematics_ECE, Physics_ECE, Chemistry_ECE");
				break;
			case 2:
				System.out.println(
						"ECE 2nd semester subjects: Signals and Systems, Electronic Devices, Digital Logic Design");
				break;
			case 3:
				System.out.println(
						"ECE 3rd semester subjects: Analog Electronics, Microprocessors, Communication Systems");
				break;
			case 4:
				System.out.println("ECE 4th semester subjects: Control Systems, Electromagnetic Fields, VLSI Design");
				break;
			case 5:
				System.out.println(
						"ECE 5th semester subjects: Digital Signal Processing, Embedded Systems, Optical Communication");
				break;
			case 6:
				System.out.println("ECE 6th semester subjects: Wireless Communication, Antenna Theory, IoT Systems");
				break;
			case 7:
				System.out.println(
						"ECE 7th semester subjects: Advanced Digital Signal Processing, Radar Systems, Robotics");
				break;
			case 8:
				System.out.println(
						"ECE 8th semester subjects: Project Work, Professional Ethics in Engineering, Emerging Technologies in ECE");
				break;
			default:
				System.out.println("Invalid semester for ECE");
				break;
			}
			break;
		default:
			System.out.println("Invalid Branch");
			break;
		}
	}
}