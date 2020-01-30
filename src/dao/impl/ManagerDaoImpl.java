package dao.impl;

import dao.ManagerDao;
import domain.Manager;
import util.JdbcDruidUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerDaoImpl implements ManagerDao {

    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;


    @Override
    public boolean checkManager(Manager manager) {
        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from manager where username = ? and password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, manager.getUsername());
            pstmt.setString(2, manager.getPassword());
            rs = pstmt.executeQuery();
            if (rs.next()) {
                return true;
            } else
                return false;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcDruidUtils.close(rs, pstmt, conn);
        }
        return false;
    }

    @Override
    public boolean addUser(Manager manager) {
        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "insert into manager(username, password) values(?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, manager.getUsername());
            pstmt.setString(2, manager.getPassword());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            JdbcDruidUtils.close(pstmt, conn);
        }
    }

    @Override
    public List<Manager> findManagerByUsername(String username){
        Manager manager = new Manager();

        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from manager where username = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();
            ArrayList<Manager> managers = new ArrayList<>();

            while (rs.next()){
                manager.setUsername(rs.getString("username"));
                manager.setPassword(rs.getString("password"));
                managers.add(manager);
            }
            return managers;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            JdbcDruidUtils.close(rs, pstmt, conn);
        }
    }
}
