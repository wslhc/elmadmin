import java.util.Scanner;

public class Text1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个值");
        int a = scanner.nextInt();

        System.out.println("请输入第二个值");
        int b = scanner.nextInt();

        System.out.println("请输入三个值");
        int c = scanner.nextInt();

     /*   if (a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>a && b>c)
        {
        System.out.println(b);
        }
        else if(c>a && c>b){
            System.out.println(c);*/
        int temp = (a > b ? a : b);
        int max = (temp > c ? temp : c);
        System.out.println("max" + max);


}
}
