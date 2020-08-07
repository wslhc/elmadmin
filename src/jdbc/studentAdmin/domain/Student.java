package jdbc.studentAdmin.domain;

import jdbc.empselectDemo.domain.EMP;
import jdbc.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    // JavaBean
    private int id;
    private String name;
    private String gender;
    private int score;
    private String addr;
    private int tel;

    public Student()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public String getAddr()
    {
        return addr;
    }

    public void setAddr(String addr)
    {
        this.addr = addr;
    }

    public int getTel()
    {
        return tel;
    }

    public void setTel(int tel)
    {
        this.tel = tel;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", addr='" + addr + '\'' +
                ", tel=" + tel +
                '}';
    }
}
