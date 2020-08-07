public class TextTeacher
{
    public static void main(String[] args)
    {
        new Teacher();
        Teacher teacher = new Teacher();

        new Student();
        Student student = new Student();


        teacher.name="z";
        teacher.age= 30;
        teacher.content = "java";
        System.out.println("年龄为"+ teacher.age+"的"+teacher.name+"老师正在吃饭");
        System.out.println("年龄为"+ teacher.age+"的"+teacher.name+"的老师正讲"+ teacher.content);

        student.name="h";
        student.age=18;
        student.content = "java";
        System.out.println("年龄为"+ teacher.age+"的"+student.name+"的同学正在吃饭");
        System.out.println("年龄为"+ teacher.age+"的"+student.name+"的同学正学"+ student.content);









//       Teacher teacher = new Teacher("周老师", 30, "java的知识");
//        Student student = new Student("韩同学", 18, "java的知识");
//
//        teacher.eat();
//        teacher.teach();
//
//        student.eat();
//        student.study();
//
//        System.out.println();
    }

}
