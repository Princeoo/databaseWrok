package dao.impl;

import dao.WorkingDao;
import domain.Working;
import util.JdbcDruidUtils;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingDaoImpl implements WorkingDao {

    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    @Override
    public List<Working> findAllWorking() {

        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from working";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            ArrayList<Working> workings = new ArrayList<>();

            while (rs.next()) {
                Working working = new Working();
                working.setId(rs.getInt("Id"));
                working.setYear(rs.getInt("Year"));
                working.setMonth(rs.getInt("Month"));
                working.setDepart_id(rs.getString("Depart_Id"));
                working.setLate_day(rs.getFloat("Late_day"));
                working.setEarly_day(rs.getFloat("Early_day"));
                working.setLeave_day(rs.getFloat("Leave_day"));
                working.setAdd_hour(rs.getFloat("Add_hour"));
                workings.add(working);

            }
            return workings;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JdbcDruidUtils.close(rs, pstmt, conn);
        }
    }

    @Override
    public List<Working> findWorkingById(int id) {

        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from working where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            ArrayList<Working> workings = new ArrayList<>();

            while (rs.next()) {
                Working working = new Working();
                working.setId(rs.getInt("Id"));
                working.setYear(rs.getInt("Year"));
                working.setMonth(rs.getInt("Month"));
                working.setDepart_id(rs.getString("Depart_Id"));
                working.setLate_day(rs.getFloat("Late_day"));
                working.setEarly_day(rs.getFloat("Early_day"));
                working.setLeave_day(rs.getFloat("Leave_day"));
                working.setAdd_hour(rs.getFloat("Add_hour"));
                workings.add(working);
            }
            return workings;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            JdbcDruidUtils.close(rs, pstmt, conn);
        }
    }

    @Override
    public void addWorking(Working working) {

        try {
            conn = JdbcDruidUtils.getConnection();

            String sql = "insert into working values(?,?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, working.getId());
            pstmt.setInt(2, working.getYear());
            pstmt.setInt(3, working.getMonth());
            pstmt.setString(4, working.getDepart_id());
            pstmt.setFloat(5, working.getLate_day());
            pstmt.setFloat(6, working.getEarly_day());
            pstmt.setFloat(7, working.getLeave_day());
            pstmt.setFloat(8, working.getAdd_hour());
            int result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcDruidUtils.close(pstmt, conn);
        }
    }

    @Override
    public void updateWorking(Working working) {

        try {
            conn = JdbcDruidUtils.getConnection();

            String sql = "update working set year=?,month=?,depart_id=?,late_day=?,early_day=?,leave_day=?,add_hour = ? where id=?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, working.getYear());
            pstmt.setInt(2, working.getMonth());
            pstmt.setString(3, working.getDepart_id());
            pstmt.setFloat(4, working.getLate_day());
            pstmt.setFloat(5, working.getEarly_day());
            pstmt.setFloat(6, working.getLeave_day());
            pstmt.setFloat(7, working.getAdd_hour());
            pstmt.setInt(8, working.getId());

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcDruidUtils.close(pstmt, conn);
        }

    }

    @Override
    public void deleteWorking(int id) {

        try {
            conn = JdbcDruidUtils.getConnection();

            String sql = "delete from working where id= ? ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);

            int result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcDruidUtils.close(pstmt, conn);
        }
    }


}
