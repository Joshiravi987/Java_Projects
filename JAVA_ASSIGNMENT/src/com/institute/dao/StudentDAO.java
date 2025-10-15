package com.institute.dao;

import com.institute.model.Student;
import com.institute.util.LoggerUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDAO {

    public int add(Student s) throws SQLException {
        String sql = "INSERT INTO students(name,email,phone) VALUES(?,?,?)";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getPhone());
            int rows = ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) s.setId(rs.getInt(1));
            }
            LoggerUtil.log("Added student: " + s);
            return rows;
        }
    }

    public List<Student> findAll() throws SQLException {
        String sql = "SELECT * FROM students";
        List<Student> list = new ArrayList<>();
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(map(rs));
            }
        }
        return list;
    }

    public Student findById(int id) throws SQLException {
        String sql = "SELECT * FROM students WHERE id=?";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return map(rs);
            }
        }
        return null;
    }

    // Demonstrates Java 8 Streams for filtering by name substring
    public List<Student> searchByName(List<Student> source, String keyword) {
        String lower = keyword.toLowerCase();
        return source.stream()
                .filter(s -> s.getName().toLowerCase().contains(lower))
                .collect(Collectors.toList());
    }

    public int update(Student s) throws SQLException {
        String sql = "UPDATE students SET name=?, email=?, phone=? WHERE id=?";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getPhone());
            ps.setInt(4, s.getId());
            int rows = ps.executeUpdate();
            LoggerUtil.log("Updated student: " + s);
            return rows;
        }
    }

    public int delete(int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id=?";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            LoggerUtil.log("Deleted student id: " + id);
            return rows;
        }
    }

    private Student map(ResultSet rs) throws SQLException {
        return new Student(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("phone")
        );
    }
}
