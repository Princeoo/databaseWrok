package dao.impl;

import dao.UserDao;
import domain.User;
import util.JdbcDruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    @Override
    public boolean checkUser(User user) {
        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            rs = pstmt.executeQuery();
            if (rs.next()) {
                return true;
            } else
                return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addUser(User user) {
        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "insert into user(username, password, id) values(?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, user.getId());
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
    public List<User> findAllUser(){
        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from user";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            ArrayList<User> users = new ArrayList<>();

            while (rs.next()){
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setId(rs.getInt("id"));
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            JdbcDruidUtils.close(rs, pstmt, conn);
        }
    }

    @Override
    public List<User> findUserByUsername(String username){
        User user = new User();

        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from user where username = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();
            ArrayList<User> users = new ArrayList<>();

            while (rs.next()){
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setId(rs.getInt("id"));
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            JdbcDruidUtils.close(rs, pstmt, conn);
        }
    }

    @Override
    public int findId(String username) {
//        User user = new User();
        int id = 0;
        try {
            conn = JdbcDruidUtils.getConnection();
            String sql="select * from user where username=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            rs=pstmt.executeQuery();

            while(rs.next())
            {
                id = rs.getInt("id");
              /*  user.setId(rs.getInt("Id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));*/
            }

        }catch(Exception e) {
            e.printStackTrace();
            return 0;
        }finally {
            JdbcDruidUtils.close(rs, pstmt, conn);
        }
        return id;/*user.getId();*/
    }


}
