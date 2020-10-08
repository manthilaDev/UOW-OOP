public class Director {
    private String name;
    private String surname;
    private int noOfDirectMovie;
    private Date dateOfBirth;

    public Director(String name,String surname)
    {
        this.name= name;
        this.surname=surname;
    }

    public String getName()
    {
        return this.name;
    }

    public String getSurname()
    {
        return this.surname;
    }

    public int getNumberOfMovie()
    {
        return this.noOfDirectMovie;
    }

    public Date getDOB()
    {
        return this.dateOfBirth;
    }
    public void setDateOfBirth(Date date)
    {
        this.dateOfBirth =date;
    }

    public void setNumberOfMovie(int num)
    {
        this.noOfDirectMovie= num;
    }

    public String toString(String name,String surname,Date Dob,int directMovie)
    {
        return "Director [ Name = "+name+" Surname = "+surname+ " Date of birth ="+
        Dob.toString()+" Number of Movie Directed = " + noOfDirectMovie+" ]";
    }

}
