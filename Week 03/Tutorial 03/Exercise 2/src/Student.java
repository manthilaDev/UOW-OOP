public class Student extends Person
{
    private int IDNumber;
    private double fee;
    private int grade;

    public Student(String name,int age,String gender,int IDNum)
    {
        super(name,age,gender);
        this.IDNumber = IDNum;
    }

    public void setIDNum(int num)
    {
        this.IDNumber =num;
    }

    public void setFee(int fee)
    {
        this.fee =fee;
    }

    public void setGrade(int grade)
    {
        this.grade =grade;
    }

    public int getIDNum()
    {
        return this.IDNumber;
    }

    public double getFee()
    {
        return this.fee;
    }

    public int getGrade()
    {
        return this.grade;
    }

    @Override
    public String toString()
    {
        return super.toString()+" ID Num :"+this.IDNumber+
        " Grade :"+this.grade+" fees :"+this.fee;
    }
}
