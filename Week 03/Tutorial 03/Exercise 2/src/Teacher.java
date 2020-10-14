public class Teacher extends Person
{
    private double salary;
    private String subject;

    public Teacher
    (String name,int age, String gender,String subject,double salary)
    {
        super(name,age,gender);
        this.salary =salary;
        this.subject =subject;

    }

    public void setSalary(double salary)
    {
        this.salary =salary;
    }

    public void setSubject(String subject)
    {
        this.subject =subject;
    }

    public String getSubject()
    {
        return this.subject;
    }

    public double getSalary()
    {
        return this.salary;
    }

    @Override
    public String toString()
    {
        return super.toString()+" ID Salary : "+this.salary+
        " Subject :"+this.subject;
    }
    
}
