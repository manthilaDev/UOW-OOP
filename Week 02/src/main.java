public class main
{
    public static void main(String [] main)
    {
        // Understanding static  
        IdentifyVariables a = new IdentifyVariables();
        IdentifyVariables b = new IdentifyVariables();
        a.y =5;
        b.y =6;
        a.x =1;
        b.x =2;
        System.out.println("a.y ="+a.y);
        System.out.println("b.y ="+b.y);
        System.out.println("a.x ="+a.x);
        System.out.println("b.x ="+b.x);
        System.out.println("IdentifyVariables.x = "+IdentifyVariables.x);
    }
}