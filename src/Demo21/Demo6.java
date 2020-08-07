public class Demo6
{
    public static void main(String[] args)
    {
        int res = max(5, 3);
        System.out.println(res);
    }
        public static int max(int num1, int num2){
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}
