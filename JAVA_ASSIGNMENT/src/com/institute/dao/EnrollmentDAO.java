package com.institute.dao;

import com.institute.model.Enrollment;
import com.institute.util.LoggerUtil;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentDAO {

    public int enroll(int studentId, int courseId) throws SQLException {
        String sql = "INSERT INTO enrollments(student_id, course_id) VALUES(?,?)";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            ps.setInt(2, courseId);
            int rows = ps.executeUpdate();
            LoggerUtil.log("Enrolled student " + studentId + " to course " + courseId);
            return rows;
        }
    }

    public List<Enrollment> findAll() throws SQLException {
        String sql = "SELECT * FROM enrollments";
        List<Enrollment> list = new ArrayList<>();
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) list.add(map(rs));
        }
        return list;
    }

    public List<Enrollment> findByStudent(int studentId) throws SQLException {
        String sql = "SELECT * FROM enrollments WHERE student_id=?";
        List<Enrollment> list = new ArrayList<>();
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
        }
        return list;
    }

    public int cancel(int studentId, int courseId) throws SQLException {
        String sql = "DELETE FROM enrollments WHERE student_id=? AND course_id=?";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            ps.setInt(2, courseId);
            int rows = ps.executeUpdate();
            LoggerUtil.log("Canceled enrollment student " + studentId + " course " + courseId);
            return rows;
        }
    }

    private Enrollment map(ResultSet rs) throws SQLException {
        Timestamp ts = rs.getTimestamp("enrolled_on");
        LocalDateTime ldt = ts != null ? ts.toLocalDateTime() : null;
        return new Enrollment(
                rs.getInt("id"),
                rs.getInt("student_id"),
                rs.getInt("course_id"),
                ldt
        );
    }
}
