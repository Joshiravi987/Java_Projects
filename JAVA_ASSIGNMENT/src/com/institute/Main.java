package com.institute;

import com.institute.dao.CourseDAO;
import com.institute.dao.EnrollmentDAO;
import com.institute.dao.StudentDAO;
import com.institute.model.Course;
import com.institute.model.Student;
import com.institute.model.Enrollment;
import com.institute.util.LoggerUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StudentDAO studentDAO = new StudentDAO();
    private static final CourseDAO courseDAO = new CourseDAO();
    private static final EnrollmentDAO enrollmentDAO = new EnrollmentDAO();

    public static void main(String[] args) {
        LoggerUtil.log("Application started");
        while (true) {
            try {
                System.out.println("\n==== Student Course Management ====");
                System.out.println("1. Student Module");
                System.out.println("2. Course Module");
                System.out.println("3. Enrollment Module");
                System.out.println("0. Exit");
                System.out.print("Choose: ");
                int choice = Integer.parseInt(br.readLine().trim());
                switch (choice) {
                    case 1: studentMenu(); break;
                    case 2: courseMenu(); break;
                    case 3: enrollmentMenu(); break;
                    case 0: LoggerUtil.log("Application exited"); System.exit(0); break;
                    default: System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    // ---- Student Module ----
    private static void studentMenu() throws Exception {
        System.out.println("\n-- Student Module --");
        System.out.println("1. Add student");
        System.out.println("2. View all");
        System.out.println("3. Search by ID");
        System.out.println("4. Search by name (Streams)");
        System.out.println("5. Update");
        System.out.println("6. Delete");
        System.out.println("0. Back");
        System.out.print("Choose: ");
        int ch = Integer.parseInt(br.readLine().trim());
        switch (ch) {
            case 1: addStudent(); break;
            case 2: listStudents(); break;
            case 3: searchStudentById(); break;
            case 4: searchStudentByName(); break;
            case 5: updateStudent(); break;
            case 6: deleteStudent(); break;
            case 0: return;
            default: System.out.println("Invalid.");
        }
    }

    private static void addStudent() throws Exception {
        System.out.print("Name: "); String name = br.readLine();
        System.out.print("Email: "); String email = br.readLine();
        System.out.print("Phone: "); String phone = br.readLine();
        try {
            studentDAO.add(new Student(name, email, phone));
            System.out.println("Student added.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void listStudents() {
        try {
            List<Student> list = studentDAO.findAll();
            System.out.printf("%-5s %-20s %-25s %-15s%n", "ID", "NAME", "EMAIL", "PHONE");
            for (Student s : list) {
                System.out.printf("%-5d %-20s %-25s %-15s%n", s.getId(), s.getName(), s.getEmail(), s.getPhone());
            }
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void searchStudentById() throws Exception {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(br.readLine().trim());
        try {
            Student s = studentDAO.findById(id);
            System.out.println(s != null ? s : "Not found.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void searchStudentByName() throws Exception {
        System.out.print("Enter name keyword: ");
        String kw = br.readLine();
        try {
            List<Student> list = studentDAO.findAll();
            List<Student> filtered = studentDAO.searchByName(list, kw);
            filtered.forEach(System.out::println);
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void updateStudent() throws Exception {
        System.out.print("ID to update: ");
        int id = Integer.parseInt(br.readLine().trim());
        System.out.print("New name: ");
        String name = br.readLine();
        System.out.print("New email: ");
        String email = br.readLine();
        System.out.print("New phone: ");
        String phone = br.readLine();
        try {
            Student s = new Student(id, name, email, phone);
            int rows = studentDAO.update(s);
            System.out.println(rows > 0 ? "Updated." : "No changes.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void deleteStudent() throws Exception {
        System.out.print("ID to delete: ");
        int id = Integer.parseInt(br.readLine().trim());
        try {
            int rows = studentDAO.delete(id);
            System.out.println(rows > 0 ? "Deleted." : "Not found.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    // ---- Course Module ----
    private static void courseMenu() throws Exception {
        System.out.println("\n-- Course Module --");
        System.out.println("1. Add course");
        System.out.println("2. View all");
        System.out.println("3. Update fees or duration");
        System.out.println("4. Delete");
        System.out.println("0. Back");
        System.out.print("Choose: ");
        int ch = Integer.parseInt(br.readLine().trim());
        switch (ch) {
            case 1: addCourse(); break;
            case 2: listCourses(); break;
            case 3: updateCourse(); break;
            case 4: deleteCourse(); break;
            case 0: return;
            default: System.out.println("Invalid.");
        }
    }

    private static void addCourse() throws Exception {
        System.out.print("Title: "); String title = br.readLine();
        System.out.print("Fees: "); BigDecimal fees = new BigDecimal(br.readLine().trim());
        System.out.print("Duration (months): "); int dur = Integer.parseInt(br.readLine().trim());
        try {
            courseDAO.add(new Course(title, fees, dur));
            System.out.println("Course added.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void listCourses() {
        try {
            List<Course> list = courseDAO.findAll();
            System.out.printf("%-5s %-25s %-10s %-10s%n", "ID", "TITLE", "FEES", "DUR(M)");
            for (Course c : list) {
                System.out.printf("%-5d %-25s %-10s %-10d%n", c.getId(), c.getTitle(), c.getFees(), c.getDurationMonths());
            }
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void updateCourse() throws Exception {
        System.out.print("Course ID: "); int id = Integer.parseInt(br.readLine().trim());
        System.out.print("New fees (blank to skip): "); String f = br.readLine().trim();
        System.out.print("New duration months (blank to skip): "); String d = br.readLine().trim();
        BigDecimal fees = f.isEmpty() ? null : new BigDecimal(f);
        Integer dur = d.isEmpty() ? null : Integer.parseInt(d);
        try {
            int rows = courseDAO.updateFeesOrDuration(id, fees, dur);
            System.out.println(rows > 0 ? "Updated." : "Not found or no changes.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void deleteCourse() throws Exception {
        System.out.print("Course ID: ");
        int id = Integer.parseInt(br.readLine().trim());
        try {
            int rows = courseDAO.delete(id);
            System.out.println(rows > 0 ? "Deleted." : "Not found.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    // ---- Enrollment Module ----
    private static void enrollmentMenu() throws Exception {
        System.out.println("\n-- Enrollment Module --");
        System.out.println("1. Enroll student in course");
        System.out.println("2. View all enrollments");
        System.out.println("3. View courses by student");
        System.out.println("4. Cancel enrollment");
        System.out.println("0. Back");
        System.out.print("Choose: ");
        int ch = Integer.parseInt(br.readLine().trim());
        switch (ch) {
            case 1: enroll(); break;
            case 2: listEnrollments(); break;
            case 3: listCoursesByStudent(); break;
            case 4: cancelEnrollment(); break;
            case 0: return;
            default: System.out.println("Invalid.");
        }
    }

    private static void enroll() throws Exception {
        System.out.print("Student ID: "); int sid = Integer.parseInt(br.readLine().trim());
        System.out.print("Course ID: "); int cid = Integer.parseInt(br.readLine().trim());
        try {
            int rows = enrollmentDAO.enroll(sid, cid);
            System.out.println(rows > 0 ? "Enrolled." : "Failed.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void listEnrollments() {
        try {
            List<Enrollment> list = enrollmentDAO.findAll();
            System.out.printf("%-5s %-10s %-10s %-20s%n", "ID", "STUDENT_ID", "COURSE_ID", "ENROLLED_ON");
            for (Enrollment e : list) {
                System.out.printf("%-5d %-10d %-10d %-20s%n", e.getId(), e.getStudentId(), e.getCourseId(), String.valueOf(e.getEnrolledOn()));
            }
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void listCoursesByStudent() throws Exception {
        System.out.print("Student ID: ");
        int sid = Integer.parseInt(br.readLine().trim());
        try {
            List<Enrollment> list = enrollmentDAO.findByStudent(sid);
            if (list.isEmpty()) {
                System.out.println("No courses for this student.");
            } else {
                System.out.printf("%-5s %-10s %-10s %-20s%n", "ID", "STUDENT_ID", "COURSE_ID", "ENROLLED_ON");
                for (Enrollment e : list) {
                    System.out.printf("%-5d %-10d %-10d %-20s%n", e.getId(), e.getStudentId(), e.getCourseId(), String.valueOf(e.getEnrolledOn()));
                }
            }
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    private static void cancelEnrollment() throws Exception {
        System.out.print("Student ID: "); int sid = Integer.parseInt(br.readLine().trim());
        System.out.print("Course ID: "); int cid = Integer.parseInt(br.readLine().trim());
        try {
            int rows = enrollmentDAO.cancel(sid, cid);
            System.out.println(rows > 0 ? "Canceled." : "Not found.");
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }
}
