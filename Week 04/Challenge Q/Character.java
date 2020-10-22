public class Character
{
    private String s1;
    private String s2;

    public Character()
    {

    }

    public Character(String s1)
    {
        this.s1=s1.toLowerCase();
        this.s1=null;
    }

    public Character(String s1,String s2)
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

    public Boolean isCharUnique(String str)
    {
        /*
        * This method will check whether there are repeating charter in a string
        */
        int matchCount =0;
        for(int i=0;i<str.length();i++)
        {
            for(int x=i+1;x<str.length();x++)
            {
                if(str.charAt(i)==str.charAt(x))
                    matchCount++;
            }
            if(matchCount>=1)
                    return false;
            else
                matchCount =0;
        }return true;
    }
}