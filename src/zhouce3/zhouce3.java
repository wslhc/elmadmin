package zhouce3;

public class zhouce3{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        double a=2,b=1;
        double sum=a/b;
        for(int i=2;i<=6;i++)
        {
            a=a+b;
            b=a-b;
            sum+=a/b;
        }
        System.out.println(sum);
    }
}
    /*public static void main(String[] args)
    {
        try {
            badMethod();
            System.out.println("A");
        } catch (Exception ex) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void badMethod(){

    }*/








/* public static class Cruncher{
        void crunch(int i){
            System.out.println("int");
        }
        void crunch(String s){
            System.out.println("String");
        }

        public static void main(String[] args)
        {
            Cruncher crun = new Cruncher();
            char ch = 'p';
            int c = 12;
            crun.crunch(ch);
            System.out.println(";");
            crun.crunch(c);

        }
    }*/
