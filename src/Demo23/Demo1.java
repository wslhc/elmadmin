package Demo23;

public class Demo1
{
    public static void main(String[] args)
    {
        // 无参
        String  str = new String();
        // 通过字符数组创建
        char data[] = {'h', 'a','h', 'a'};
        String s = new String(data);
        // 通过字节数组创建
        byte bytes[] = {97, 98, 99};
        String s2 = new String(bytes);
    }
}
