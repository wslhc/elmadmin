package Demo30.Yicahng;

import java.util.Arrays;

public class Demo4
{
    public static void main(String[] args)
    {

        Person[] array = {
                new Person("貂蝉", 223),
                new Person("孙尚香", 18),
                new Person("妲己", 300),
                new Person("杨玉环", 221),
        };

        Arrays.sort(array,(Person a, Person b)-> {
            return  a.getAge()-b.getAge();
        });
for (Person person : array){
    System.out.println(
            person
    );
}
    }
}
