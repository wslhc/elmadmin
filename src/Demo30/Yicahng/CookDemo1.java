package Demo30.Yicahng;

public class CookDemo1
{
    public static void main(String[] args)
    {
        invoke(new Cook(){
            @Override
                    public  void makeFood(){
            System.out.println("好烦了");
        }
    });
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}

