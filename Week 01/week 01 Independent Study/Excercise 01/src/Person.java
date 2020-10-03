package application;
public class Person
{
    private String name;
    private String surname;
    private int age;

    public Person(String n)
    {
        this.name =n;
    }

    public void displayName()
    {
        System.out.println(this.name);
    }

    public void setSurname(String s)
    {
        this.surname =s;
    }

    public void setAge(int num)
    {
        this.age =num;
    }

    public String getSurname()
    {
        return this.surname;
    }

    public int getAge()
    {
        return this.age;
    }
}