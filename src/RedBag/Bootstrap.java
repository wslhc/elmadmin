package RedBag;

import java.util.Random;

public class Bootstrap
{
    public static void main(String[] args)
    {
        //设置标题
        Myred myred = new Myred("java9班");
        //设置群主名
        myred.setOwnerName("马化腾");
        //设置分发策略
        /*NormalMide normalMide = new NormalMide();
        myred.setOpenWay(normalMide);*/

      RadomMode radomMode = new RadomMode();

        myred.setOpenWay(radomMode);

    }
}
