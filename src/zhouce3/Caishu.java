package zhouce3;

import java.util.Random;
import java.util.Scanner;

public class Caishu
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字范围");
        int a = scanner.nextInt();

        Random random = new Random();
       int b = random.nextInt(a)+1;

        int c = 0;

        while(true){
            System.out.println("请输入你的数");
            int d = scanner.nextInt();
           c++;
        if (d>b){
            System.out.println("你输入的数大了");

        }else if (d<b){
            System.out.println("你输入的数小了");

        }
        else{
            System.out.println("恭喜你猜对了");
            System.out.println("你一共猜了"+c+"次");
            break;
        }

}
    }
}

