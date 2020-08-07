package Demo27;

public class TestDemo1

{
    public static void main(String[] args)
    {
        Demo1 demo1 = new Demo1("张三", 11);
        Demo1 demo2 = new Demo1("张四", 11);
        Demo1 demo3 = new Demo1("张wu", 11);
        System.out.println(demo1);
        System.out.println(demo1.equals(demo2));
        System.out.println(demo1.equals(demo3));
    }
}
