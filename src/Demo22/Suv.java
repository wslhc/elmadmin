package Demo22;

import java.util.ArrayList;

public class Suv extends Auto
{
    final int smallsize = 4295;
    final int nomalsize = 5070;

    public ArrayList<Suv> carsize(ArrayList<Suv> list)
    {
        ArrayList<Suv> outlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size > smallsize && list.get(i).size <= nomalsize) {
                list.get(i).brand="中型SUV";
                outlist.add(list.get(i));
            }
            else if(list.get(i).size<=smallsize)
            {
                list.get(i).brand="小型SUV";
            }
            else{
                list.get(i).brand="大型SUV";
            }

        }
        return outlist;
    }
}


