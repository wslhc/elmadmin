package Demo22;

public class Student extends Teacher
{
    String fenshu;

    public Student()
    {
    }

    public Student(String fenshu)
    {
        this.fenshu = fenshu;
    }

    public Student(String 李四, int i)
    {
        super();
    }

    public String getfenshu()
    {
        return fenshu;
    }

    public void setfenshu(String fenshu)
    {
        this.fenshu = fenshu;
    }
    public void kao(){
        System.out.println(name+"同学，考试得了"+fenshu+"分");
    }
}
