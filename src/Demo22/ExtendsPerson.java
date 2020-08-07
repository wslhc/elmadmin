package Demo22;

public class ExtendsPerson
{
    public static void main(String[] args)
    {
        Person person = new Person();
        Teacher1 teacher1 = new Teacher1();
        Student student = new Student();
        teacher1.name = "王小平";
        teacher1.xueke = "java";
        teacher1.teach();
        student.name = "李小乐";
        student.fenshu = "90";
        student.kao();


    }
}
