package uk.oop.week04;
public class Date
{
    private int day;
    private int month;
    private int year;

    public Date()
    {

    }

    public Date(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setDay(int day)
    {
        this.day =day;
    }

    public void setMonth(int month)
    {
        this.month =month;
    }

    public void setYear(int year)
    {
        this.year =year;
    }

    public int getDay()
    {
        return this.day;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getYear()
    {
        return this.year;
    }

    @Override
    public String toString()
    {
        return this.day+" /"+this.month+" /"+this.year;
    }
}