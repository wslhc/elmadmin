package Demo24.inferfaceDemo;

public interface LiveAble
{
    //定义抽象方法
    public abstract void eat();

    public abstract void sleep();

    public static void run()
    {
        System.out.println("霍瑞让狗追着嗷嗷跑");
    }

    public default void fly()
    {
        System.out.println("我会飞");
    }

}
