package Demo28;

import java.util.ArrayList;

public class Zuoye4
{
   /* public static void main(String[] args)
    {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("haha");
        obj.add("python");
        obj.add("java");
        System.out.println(listTest(obj,"java"));
    }
    public static boolean listTest(ArrayList<String> al, String s){
        if (al.contains(s)){
            return true;
        }
        return false;
    }*/
   public static void main(String[] args)
   {
       ArrayList<String> list = new ArrayList<String>();
              list.add("1");
       System.out.println(listTest(list));
   }

 public static boolean listTest(ArrayList<String> al){
       if (al.isEmpty()){
           return true;
       }
       return false;
}
}
