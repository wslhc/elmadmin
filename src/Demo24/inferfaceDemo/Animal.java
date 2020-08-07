package Demo24.inferfaceDemo;

public class Animal implements LiveAble
{
    //无法重写静态的方法（static）

    @Override
    public void eat()
    {
        System.out.println("就知道吃");
    }

    @Override
    public void sleep()
    {
        System.out.println("还睡啊");
    }

    @Override
    public void fly()
    {
        System.out.println("飞 飞 飞");
    }
}
