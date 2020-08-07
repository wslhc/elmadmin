package Demo29;

import java.util.Objects;
import java.util.PrimitiveIterator;

// 1.定义汽车类.包含名称和价格属性,重写hashCode和equals方法
public class Car
{

    private String name;

    private String color;

    public Car()
    {
    }

    public Car(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}

