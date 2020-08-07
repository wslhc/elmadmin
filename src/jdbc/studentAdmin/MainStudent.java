package jdbc.studentAdmin;

import jdbc.studentAdmin.dao.Impl.StudentDaoImpl;
import jdbc.studentAdmin.dao.StudentDao;
import jdbc.studentAdmin.domain.Student;

import java.util.List;


public class MainStudent {
    public static void main(String[] args) {
        System.out.println("-------- 欢迎登录low版学生管理系统---------");

        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println("----------学生列表------------------------");
        List<Student> list = studentDao.findAll();
        for (Student s:list){
            System.out.println(s);
        }
        System.out.println("----------保存学生------------------------");
        //查看
        StudentDaoImpl dao = new StudentDaoImpl();
        dao.findAll();
        //        添加 studentDao.save();

        // 修改


        // 删除

    }
}
