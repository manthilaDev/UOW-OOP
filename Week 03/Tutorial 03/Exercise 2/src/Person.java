public class Person
{
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name,int age,String gender)
    {
        this.myName =name;
        this.myAge =age;
        this.myGender =gender;
    }

    public String toString()
    {
        return this.myName +", age : "+this.myAge+
        " , gender :"+this.myGender;

    }

    public String getName()
    {
        return this.myName;
    }

    public String getGender()
    {
        return this.myGender;
    }

    public int getAge()
    {
        return this.myAge;
    }
    
    public void setName(String myName)
    {
        this.myName =myName;
    }

    public void setGender(String myGender)
    {
        this.myGender =myGender;
    }

    public void setAge(int myAge)
    {
        this.myAge =myAge;
    }
}
