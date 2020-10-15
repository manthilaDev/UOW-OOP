public class Challenge
{
    String s1;
    String s2;

    public Challenge(String s1,String s2)
    {
        this.s1 =s1;
        this.s2 =s2;
    }

    public Boolean isSubString()
    {
        int count =0;
        int last =s1.length()-1;
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
}