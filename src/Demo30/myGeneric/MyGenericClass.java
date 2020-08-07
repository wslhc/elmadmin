package Demo30.myGeneric;

public class MyGenericClass<Mvp>{
    //没有Mvp类型，在这里代表一种未知的数据类型
    //未来传递什么类型就是什么类型
    private Mvp mvp;

    public Mvp getMvp()
    {
        return mvp;
    }

    public void setMvp(Mvp mvp)
    {
        this.mvp = mvp;
    }
}
