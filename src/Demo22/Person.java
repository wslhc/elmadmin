package Demo22;

public class Person
{
    String name;
    int age;

    Person()
    {
    }

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public void showMsg(){
        System.out.println("基本信息");
    }
}
