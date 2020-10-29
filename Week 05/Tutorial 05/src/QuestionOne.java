import java.util.*;
public class QuestionOne
{
    public static void loadArray(int[] list)
    {
        for(int i =1;i<list.length;i++)
        {
            list[i]=list[i]+list[i-1];
        }
    }

    public static void main(String[] args) 
    {
        int[] a ={7};
        int[] b={3,6};
        int[] c={4,6,8};
        int[] d={1,2,3,4};
        int[] e={8,4,2,04};
        loadArray(a);
        loadArray(b);
        loadArray(c);
        loadArray(d);
        loadArray(e);
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));        
    }
}