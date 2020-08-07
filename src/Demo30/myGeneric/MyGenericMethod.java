package Demo30.myGeneric;

public class MyGenericMethod
{
    public <Mvp> void show(Mvp mvp){
        System.out.println("");
    }

    public <Mvp> Mvp show2(Mvp mvp){
        return mvp;
    }

}
