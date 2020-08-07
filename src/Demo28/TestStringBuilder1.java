package Demo28;

public class TestStringBuilder1
{
    public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder("hello");
        System.out.println("builder = " +builder);
        System.out.println("builder1 = " +builder1);
        System.out.println(builder1 == builder);// true
        //可以添加任何类型
    /*    builder.append("啥呀");
        builder.append("狗啊");
        builder.append("1111111");*/
        //在我们开发中，会遇到调用一个方法后，返回一个对象的情况
        //然后返回的对象继续调用方法
        //这种我们可以用链式编程方式
        builder.append("haha").append("哈哈");
        System.out.println("builder = " + builder);


    }
}
