package Demo29;

import java.util.Objects;

public class Demo4
{
    private String name;
    private  int age;

    public Demo4()
    {
    }

    public Demo4(String name, int age)
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

    @Override
    public String toString()
    {
        return "Demo4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo4 demo4 = (Demo4) o;
        return age == demo4.age &&
                Objects.equals(name, demo4.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, age);
    }
}
