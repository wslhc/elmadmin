public class Demo7
{
    public static void main(String[] args)
    {
        System.out.println(getsum(100));
    }
        public static int getsum(int num){
            int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum += i;
        }
        return sum;
    }


}
