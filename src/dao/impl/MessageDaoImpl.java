package dao.impl;

import dao.MessageDao;
import domain.Message;
import domain.User;
import util.JdbcDruidUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MessageDaoImpl implements MessageDao {
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    @Override
    public List<Message> findAllMessage() {

        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from message";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            ArrayList<Message> messages = new ArrayList<>();

            while (rs.next()) {
                Message message = new Message();
                message.setId(rs.getInt("Id"));
                message.setName(rs.getString("Name"));
                message.setAge(rs.getInt("Age"));
                message.setSex(rs.getString("Sex"));
                message.setPhone_num(rs.getString("Phone_num"));
                message.setIdentity(rs.getString("Identity"));
                message.setDepart_id(rs.getString("Depart_Id"));
                messages.add(message);
            }
            return messages;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JdbcDruidUtils.close(rs, pstmt, conn);
        }
    }

    @Override
    public List<Message> findMessageById(int id) {
        Message message = new Message();

        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from message where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            ArrayList<Message> m = new ArrayList<>();

            while (rs.next()) {
                message.setId(rs.getInt("Id"));
                message.setName(rs.getString("Name"));
                message.setAge(rs.getInt("Age"));
                message.setSex(rs.getString("Sex"));
                message.setPhone_num(rs.getString("Phone_Num"));
                message.setIdentity(rs.getString("Identity"));
                message.setDepart_id(rs.getString("Depart_Id"));
                m.add(message);
            }
            return m;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            JdbcDruidUtils.close(rs, pstmt, conn);
        }
    }

    @Override
    public void addMessage(Message message) {

        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "insert into message values(null,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, message.getName());
            pstmt.setInt(2, message.getAge());
            pstmt.setString(3, message.getSex());
            pstmt.setString(4, message.getPhone_num());
            pstmt.setString(5, message.getIdentity());
            pstmt.setString(6, message.getDepart_id());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcDruidUtils.close(pstmt, conn);
        }
    }

    @Override
    public void updateMessage(Message message) {

        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "update message set Name = ?, Age = ?, sex = ?, phone_num = ?, identity = ?, depart_id = ? where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, message.getName());
            pstmt.setInt(2, message.getAge());
            pstmt.setString(3, message.getSex());
            pstmt.setString(4, message.getPhone_num());
            pstmt.setString(5, message.getIdentity());
            pstmt.setString(6, message.getDepart_id());
            pstmt.setInt(7, message.getId());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcDruidUtils.close(pstmt, conn);
        }


    }

    @Override
    public void deleteMessage(int id) {
        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "delete from message where id= ? ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcDruidUtils.close(pstmt, conn);
        }
    }


}

