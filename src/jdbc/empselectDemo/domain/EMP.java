package jdbc.empselectDemo.domain;

import java.util.Date;

//domain层是与数据库中表字段一一对应的数据，就是一个JavaBean
public class EMP
{
    //emp类是与数据库中表字段一一对应的数据。

    //成员变量私有
    private Integer id;
    private String name;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Integer salary;
    private Integer bouns;
    private Integer deptno;
    //空参构造

    public EMP()
    {
    }

    //get/set

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
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

    public String getJob()
    {
        return job;
    }

    public void setJob(String job)
    {
        this.job = job;
    }

    public Integer getMgr()
    {
        return mgr;
    }

    public void setMgr(Integer mgr)
    {
        this.mgr = mgr;
    }

    public Date getHiredate()
    {
        return hiredate;
    }

    public void setHiredate(Date hiredate)
    {
        this.hiredate = hiredate;
    }

    public Integer getSalary()
    {
        return salary;
    }

    public void setSalary(Integer salary)
    {
        this.salary = salary;
    }

    public Integer getBouns()
    {
        return bouns;
    }

    public void setBouns(Integer bouns)
    {
        this.bouns = bouns;
    }

    public Integer getDeptno()
    {
        return deptno;
    }

    public void setDeptno(Integer deptno)
    {
        this.deptno = deptno;
    }

    @Override
    public String toString()
    {
        return "EMP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", salary=" + salary +
                ", bouns=" + bouns +
                ", deptno=" + deptno +
                '}';
    }
}
