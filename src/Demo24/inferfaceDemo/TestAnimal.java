package Demo24.inferfaceDemo;

public class TestAnimal
{
    public static void main(String[] args)
    {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        LiveAble.run();// 静态调用
        a.fly();    // 调用默认方法（重写的主调用）

    }
}
