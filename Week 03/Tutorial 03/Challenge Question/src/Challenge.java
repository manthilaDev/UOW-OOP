public class Challenge
{
    private String s1;
    private String s2;

    public Challenge(String s1,String s2)
    {
        /*
        *  Establishing the Strings
        *  lowercase will be accepted for attributes
        */
        this.s1 =s1.toLowerCase();
        this.s2 =s2.toLowerCase();

    }

    public Boolean isSubString() throws Exception
    {
        if(s1.length()==s2.length())
        {
            int count =0; // to keep count of the matching characters 
            int last =s1.length()-1; // Index of the last character in the word
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)==s2.charAt(last-i))
                {
                    count++;
                }
            }
            if (count==s1.length())
                return true;
            else
                return false;
        }
        else
        {       
            throw new Exception("Character counters should match");
        }
    }
}