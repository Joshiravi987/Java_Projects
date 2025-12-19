package example.student_service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;
   
    @Autowired
    private SchoolClient schoolClient;

    // 🟢 1. POST - Create Student
    public ResponseEntity<?> createStudent(Student student) {
        try {
            Student savedStudent = studentRepository.save(student);
            return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("Error creating student: {}", e.getMessage());
            return new ResponseEntity<>("Error saving student: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 🔵 2. GET - Fetch Student By ID (With School Data)
    public ResponseEntity<?> fetchStudentById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isEmpty()) {
            return new ResponseEntity<>("No Student Found", HttpStatus.NOT_FOUND);
        }

        Student student = optionalStudent.get();
        School school = null;
       
        try {
            if (student.getSchoolId() != null) {
                school = schoolClient.getSchoolById(student.getSchoolId().longValue());
            }
        } catch (Exception e) {
            logger.error("Feign Error: School Service down or ID {} not found", student.getSchoolId());
        }

        StudentResponse studentResponse = new StudentResponse(
            student.getId(), student.getName(), student.getAge(), student.getGender(), school
        );
        return new ResponseEntity<>(studentResponse, HttpStatus.OK);
    }

    // 🔵 3. GET - Fetch All Students (With Combined School Data)
    public ResponseEntity<?> fetchAllStudents() {
        try {
            List<Student> students = studentRepository.findAll();
            List<StudentResponse> studentResponses = new ArrayList<>();

            for (Student student : students) {
                School school = null;
                try {
                    // ✅ Fix: Long to Integer conversion in loop
                    if (student.getSchoolId() != null) {
                        school = schoolClient.getSchoolById(student.getSchoolId().longValue());
                    }
                } catch (Exception e) {
                    logger.warn("Could not fetch school for student ID: {}", student.getId());
                }
                studentResponses.add(new StudentResponse(
                    student.getId(), student.getName(), student.getAge(), student.getGender(), school
                ));
            }
            return new ResponseEntity<>(studentResponses, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 🟡 4. PUT - Update Student
    public ResponseEntity<?> updateStudent(Long id, Student updatedData) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student existing = optionalStudent.get();
            existing.setName(updatedData.getName());
            existing.setAge(updatedData.getAge());
            existing.setGender(updatedData.getGender());
            existing.setSchoolId(updatedData.getSchoolId());
            return new ResponseEntity<>(studentRepository.save(existing), HttpStatus.OK);
        }
        return new ResponseEntity<>("Student not found with ID: " + id, HttpStatus.NOT_FOUND);
    }

    // 🔴 5. DELETE - Delete Student
    public ResponseEntity<?> deleteStudentById(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Student not found with ID: " + id, HttpStatus.NOT_FOUND);
    }
}