package Demo30.Yicahng;

import java.io.FileNotFoundException;

public class Demo1
{
    public static void main(String[] args)
    {
        try{
            read("xiaomimi.txt");
        }catch (Exception e){
            //在try中抛出什么异常，在括号里就捕捉什么异常
            //  e.printStackTrace();
            System.out.println("++++++++++");
            System.out.println(e);
        }
        finally {
            System.out.println("不管try和catch执行了啥，我都会执行");
            System.out.println("我是接盘侠");
        }
        System.out.println("end");
    }
    public static void read(String path) throws FileNotFoundException
    {
        if (! path.equals("xiaomimi.txt")){
            throw new FileNotFoundException("你的文件怎么消失了呢");
        }
    }
}
