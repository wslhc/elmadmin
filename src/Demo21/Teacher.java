public class Teacher
{
    String name;
    int age;
    String content;

   Teacher(){

   }

//   Teacher(String name, int age, String content){
//       this.name = name;
//       this.age = age;
//       this.content = content;
//   }

    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"正在吃饭");
    }
    public void teach(){
        System.out.println("年龄为"+age+"的"+name+"正在亢奋的讲着"+content);
    }
}
