public class Movie
{
    private String title;
    private String category;
    private int awards;
    private Director director;

    public Movie (String title,String category,Director director)
    {
        this.title =title;
        this.category =category;;
        this.awards =awards;
        this.director =director;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getCategory()
    {
        return this.category;
    }

    public Director getDirector()
    {
        return this.director;
    }

    public void setNumAwards(int numAwards)
    {
        this.awards =numAwards;
    }

    public int getNumAwards()
    {
        return this.awards;
    }

    public String toString()
    {
        return "Movie [ title = "+this.title+", category = "+this.category+", director name ="
        +", "+this.director.getName()+", director surname = "+this.director.getSurname()+", number of awards "
        +this.awards;
    }

}