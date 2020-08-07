package jdbc;
import jdbc.empselectDemo.domain.EMP;
import jdbc.utils.JDBCUtils;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCEmp {
    public static void main(String[] args) {
//        List<Emp> list = new JDBCEmp().findAll();
//        for (Emp emp : list) {
//            System.out.println(emp);
//        }
        List<EMP> list = new JDBCEmp().findAllUseJDBCUtils();
        for (EMP emp : list) {
            System.out.println(emp);
        }
    }
    public List<EMP> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<EMP> list = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");
            String sql = "select * from emp limit 10;";
            stmt = conn.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");
                // 封装 入emp
                EMP emp = new EMP();
                emp.setId(id);
                emp.setName(ename);
                emp.setJob(job);
                emp.setMgr(mgr);
                emp.setHiredate(hiredate);
                emp.setSalary(sal);
                emp.setBouns(comm);
                emp.setDeptno(deptno);
                // 添加进集合
                list.add(emp);
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
    /**
     * 演示JDBCUtils
     */
    public List<EMP> findAllUseJDBCUtils() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<EMP> list = null;
        try {
            conn = JDBCUtils.getConnection();
            // 定义sql
            String sql = "select * from emp limit 10;";
            stmt = conn.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate("hiredate");
                int sal = rs.getInt("sal");
                int comm = rs.getInt("comm");
                int deptno = rs.getInt("deptno");
                // 封装 入emp
                EMP emp = new EMP();
                emp.setId(id);
                emp.setName(ename);
                emp.setJob(job);
                emp.setMgr(mgr);
                emp.setHiredate(hiredate);
                emp.setSalary(sal);
                emp.setBouns(comm);
                emp.setDeptno(deptno);
                // 添加进集合
                list.add(emp);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, stmt, conn);
        }
        return list;
    }
}