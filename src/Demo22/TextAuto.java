package Demo22;

import java.util.ArrayList;
import java.util.Arrays;

public class TextAuto
{
    public static void main(String[] args)
    {
        Suv s1=new Suv();
        s1.price=760000;
        s1.size=4813;
        Suv s2=new Suv();
        s2.price=188800;
        s2.size=4545;
        Suv s3=new Suv();
        s3.price=190000;
        s3.size=5600;
        Suv s4=new Suv();
        s4.price=100000;
        s4.size=2000;
        ArrayList<Suv> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        ArrayList<Suv> outlist=s1.carsize(list);
        for (int i = 0; i < outlist.size(); i++) {
            System.out.println("车型：" + outlist.get(i).brand);
            System.out.println("  " + "价格：" + outlist.get(i).price);
            System.out.println("  " + "车长：" + outlist.get(i).size);
        }

    }
}


