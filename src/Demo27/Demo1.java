package Demo27;

import java.util.Objects;

public class Demo1
{
    private String name;
    private int age;

    public Demo1(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Demo1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        //如果对象地址值一样，则认为相同
        if (this == o)
            return true;
        //如果参数为空，或者类型信息不一样，则认为不同
        if (o == null || getClass() != o.getClass())
            return false;
        //转换为当前类型
        Demo1 demo1 = (Demo1) o;
        //要求基本类型相等，并且将引用类型交给Objects类的equals静态方法取用结果
        return age == demo1.age && Objects.equals(this.name, demo1.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, age);
    }
}
