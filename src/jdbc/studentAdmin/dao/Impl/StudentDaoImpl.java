package jdbc.studentAdmin.dao.Impl;

import jdbc.empselectDemo.domain.EMP;

import jdbc.studentAdmin.dao.StudentDao;
import jdbc.studentAdmin.domain.Student;
import jdbc.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl  implements StudentDao
{
    @Override
    public List<Student> findAll()
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Student> list = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");
            String sql = "select * from studentManager limit 1;";
            stmt = conn.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int score = rs.getInt("score");
                 String addr = rs.getString("addr");
              int tel = rs.getInt("tel");
                // 封装 入emp
                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setGender(gender);
                student.setScore(score);
                student.setAddr(addr);
                student.setTel(tel);
                // 添加进集合
                list.add(student);
            }
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public void update(Student student) {

    }
}
