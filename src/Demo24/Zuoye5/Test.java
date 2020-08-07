package Demo24.Zuoye5;

public class Test
{
    public static void main(String[] args)
    {
     Star s = new Star();
      s.shine();

        System.out.println("====================");
        Universe universe = new Sun();

        universe.doAnything();
        Sun sun = (Sun) universe;
        sun.Shine();

    }
}
