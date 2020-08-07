package Demo30.Yicahng;

public class CookDemo2
{
    public static void main(String[] args)
    {
        invoke(()->{
            System.out.println("lambda 做的饭太好可");

        });
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
