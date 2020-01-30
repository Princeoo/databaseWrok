package dao.impl;

import dao.SalaryDao;
import domain.Salary;
import util.JdbcDruidUtils;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalaryDaoImpl implements SalaryDao {

    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;


    public List<Salary> findAllSalary() {


        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from salary";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            ArrayList<Salary> salaries = new ArrayList<>();

            while (rs.next()) {
                Salary salary = new Salary();
                salary.setId(rs.getInt("Id"));
                salary.setYear(rs.getInt("Year"));
                salary.setMonth(rs.getInt("Month"));
                salary.setDepart_id(rs.getString("Depart_Id"));
                salary.setBase_pay(rs.getFloat("Base_pay"));
                salary.setHouse_add(rs.getFloat("House_Add"));
                salary.setShould_pay(rs.getFloat("Should_pay"));
                salary.setDeduct_pay(rs.getFloat("Deduct_pay"));
                salary.setActual_pay(rs.getFloat("Actual_pay"));
                salaries.add(salary);
            }
            return salaries;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            JdbcDruidUtils.close(rs, pstmt, conn);
        }
    }

    @Override
    public List<Salary> findSalaryById(int id) {
        Salary salary = new Salary();

        try {
            conn = JdbcDruidUtils.getConnection();
            String sql = "select * from salary where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            ArrayList<Salary> m = new ArrayList<>();

            while (rs.next()) {
                salary.setId(rs.getInt("Id"));
                salary.setYear(rs.getInt("Year"));
                salary.setMonth(rs.getInt("Month"));
                salary.setDepart_id(rs.getString("Depart_Id"));
                salary.setBase_pay(rs.getFloat("Base_pay"));
                salary.setHouse_add(rs.getFloat("House_Add"));
                salary.setShould_pay(rs.getFloat("Should_pay"));
                salary.setDeduct_pay(rs.getFloat("Deduct_pay"));
                salary.setActual_pay(rs.getFloat("Actual_pay"));
                m.add(salary);
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
    public void addSalary(Salary salary) {

        try {
            conn = JdbcDruidUtils.getConnection();

            String sql = "insert into salary values(?,?,?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, salary.getId());
            pstmt.setInt(2, salary.getYear());
            pstmt.setInt(3, salary.getMonth());
            pstmt.setString(4, salary.getDepart_id());
            pstmt.setFloat(5, salary.getBase_pay());
            pstmt.setFloat(6, salary.getHouse_add());
            pstmt.setFloat(7, salary.getShould_pay());
            pstmt.setFloat(8, salary.getDeduct_pay());
            pstmt.setFloat(9, salary.getActual_pay());
            int result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcDruidUtils.close(pstmt, conn);
        }

    }

    @Override
    public void deleteSalary(int id) {
        try {
            conn = JdbcDruidUtils.getConnection();

            String sql = "delete from salary where id= ? ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);

            int result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcDruidUtils.close(pstmt, conn);
        }
    }


    @Override
    public void updateSalary(Salary salary) {
        try {
            conn = JdbcDruidUtils.getConnection();

            String sql = "update salary set Year=?,Month=?,Depart_id=?,Base_pay=?,House_add=?,Should_pay=?,Deduct_pay=?,Actual_pay=? where id=?";
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, salary.getYear());
            pstmt.setInt(2, salary.getMonth());
            pstmt.setString(3, salary.getDepart_id());
            pstmt.setFloat(4, salary.getBase_pay());
            pstmt.setFloat(5, salary.getHouse_add());
            pstmt.setFloat(6, salary.getShould_pay());
            pstmt.setFloat(7, salary.getDeduct_pay());
            pstmt.setFloat(8, salary.getActual_pay());
            pstmt.setInt(9, salary.getId());

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcDruidUtils.close(pstmt, conn);
        }

    }

}

