package Demo24.compterDemo;



public class Test
{
    public static void main(String[] args)
    {
        Computer c = new Computer();
        c.run();
        //多态
        USB u = new Mouse();
        //电脑使用鼠标
        c.useUSB(u);
        USB Kb = new KeyBoard();
     c.useUSB(Kb);
     c.shutDown();
    }
}
