package Demo30.myGeneric;

public class TestMyGenericDemo2
{
    public static void main(String[] args)
    {
        //在调用方法时，就确定了泛型的类型
        MyGenericMethod mgm = new MyGenericMethod();
        mgm.show("aaa");
        mgm.show(45);
        mgm.show(78.9);
        System.out.println(mgm);
    }

}
