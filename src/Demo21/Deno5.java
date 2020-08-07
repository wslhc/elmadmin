class Demo5
{
    public static void main(String args[])
    {
        /*
         * 打印一个3行，3列的矩形
         */
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        /*
         * 打印一个5行，6列的矩形
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        /*
         * 打印一个7行，8列的矩形
         */
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
