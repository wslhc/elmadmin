import java.util.Random;

public class Demo1
{
    public static void main(String[] args)
    {
        Random r = new Random();
        for (int i = 0; i < 100 ; i++) {
            int num = r.nextInt(5);
            System.out.println(num);
        }
        //get Num(num)
    }
}
