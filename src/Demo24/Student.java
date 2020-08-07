package Demo24;

public class Student
{
    private String name;
    private int age;
    //学号
    private int sid;
    //类变量，记录学生数量
    public static int numberofStudent = 0;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.sid = ++numberofStudent;
    }
    public static void shownum(){
        System.out.println(numberofStudent);
    }
    public void show(){
        System.out.println("学员 ：name ="+name+", age"+age+"sid"+sid);
    }
}
