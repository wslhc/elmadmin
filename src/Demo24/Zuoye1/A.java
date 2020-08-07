package Demo24.Zuoye1;

interface A
{
    public abstract void showA();
    public default void showB(){
        System.out.println("BBBBBB");
    }
}
