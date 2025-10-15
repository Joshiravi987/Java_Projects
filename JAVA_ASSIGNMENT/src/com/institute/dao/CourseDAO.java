package com.institute.dao;

import com.institute.model.Course;
import com.institute.util.LoggerUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

    public int add(Course c) throws SQLException {
        String sql = "INSERT INTO courses(title,fees,duration_months) VALUES(?,?,?)";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, c.getTitle());
            ps.setBigDecimal(2, c.getFees());
            ps.setInt(3, c.getDurationMonths());
            int rows = ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) c.setId(rs.getInt(1));
            }
            LoggerUtil.log("Added course: " + c);
            return rows;
        }
    }

    public List<Course> findAll() throws SQLException {
        String sql = "SELECT * FROM courses";
        List<Course> list = new ArrayList<>();
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) list.add(map(rs));
        }
        return list;
    }

    public Course findById(int id) throws SQLException {
        String sql = "SELECT * FROM courses WHERE id=?";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return map(rs);
            }
        }
        return null;
    }

    public int updateFeesOrDuration(int id, java.math.BigDecimal fees, Integer durationMonths) throws SQLException {
        StringBuilder sb = new StringBuilder("UPDATE courses SET ");
        boolean addComma = false;
        if (fees != null) { sb.append("fees=?"); addComma = true; }
        if (durationMonths != null) { sb.append(addComma ? ", " : "").append("duration_months=?"); }
        sb.append(" WHERE id=?");
        String sql = sb.toString();

        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            int idx = 1;
            if (fees != null) ps.setBigDecimal(idx++, fees);
            if (durationMonths != null) ps.setInt(idx++, durationMonths);
            ps.setInt(idx, id);
            int rows = ps.executeUpdate();
            LoggerUtil.log("Updated course id=" + id + ", fees=" + fees + ", duration=" + durationMonths);
            return rows;
        }
    }

    public int delete(int id) throws SQLException {
        String sql = "DELETE FROM courses WHERE id=?";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            LoggerUtil.log("Deleted course id: " + id);
            return rows;
        }
    }

    private Course map(ResultSet rs) throws SQLException {
        return new Course(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getBigDecimal("fees"),
                rs.getInt("duration_months")
        );
    }
}
