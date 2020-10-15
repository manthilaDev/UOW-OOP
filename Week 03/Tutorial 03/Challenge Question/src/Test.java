public class Test 
{
    public static void main(String [] args){
    Challenge rotate = new Challenge("hello","olleH");
    try 
    {
        System.out.println(rotate.isSubString());
    }catch (Exception e)
    {
        System.err.println("Oops Please Enter words that have matching Word Counts");
    }
    
    }
    
}
