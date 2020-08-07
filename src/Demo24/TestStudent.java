package Demo24;

public class TestStudent
{
    public static void main(String[] args)
    {
       Student s1 = new Student("黄奕等",22);
       //访问类变量
       s1.show();
       //访问静态方法
       Student.shownum();
    }
}
