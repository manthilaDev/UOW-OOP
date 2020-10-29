import java.util.ArrayList;
import java.util.List;
public class QuestionTwo
{
    public static void listDemo(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            int element =list.get(i);
            list.remove(i);
            list.add(0,element+1);
        }
        System.out.println(list);
    }

    public static void main(String [] args)
    {
        ArrayList<Integer> a = new ArrayList<>(List.of(5,10,15));
        ArrayList<Integer> b = new ArrayList<>(List.of(8,2,8,7,4));
        ArrayList<Integer> c = new ArrayList<>(List.of(-1,3,28,17,9,30));
        listDemo(a);
        listDemo(b);
        listDemo(c);
    }
    
}
