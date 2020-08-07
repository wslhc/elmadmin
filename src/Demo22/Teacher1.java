package Demo22;

public class Teacher1 extends Person
{
    String xueke;

    Teacher1()
    {
    }

    Teacher1(String xueke)
    {
        this.xueke = xueke;
    }

    public String getXueke()
    {
        return xueke;
    }

    public void setXueke(String xueke)
    {
        this.xueke = xueke;
    }
    public void teach(){
        System.out.println(name+"老师，讲授"+xueke+"课");
    }
}
