public class Book implements Comparable<Book>
{
    String title;
    String author;
    double price;
    int year;
    
    public Book(String title,String name,int year)
    {
        this.title=title;
        this.author=name;
        this.year =year;
    }

    public Book(String title,String name,int year,
    double price)
    {
        this.title =title;
        this.author= name;
        this.year =year;
        this.price =price;
    }

    public void setTitle(String title)
    {
        this.title =title;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public String getTitle()
    {
        return this.title;
    }
    
    public String getAuthor()
    {
        return this.author;
    }

    public double getPrice() 
    {
        return this.price;
    }

    public int getYear() 
    {
        return this.year;
    }


    @Override
    public String toString()
    {
        return "Book Title : "+this.title+" Author : "+this.author
        +" The year Published: "+this.year+" Price :"+this.price;
    }

    public int compareTo(Book o) {
        if(this.year != o.year)
          return Double.compare(this.year, o.year); 
        return 0;
    }

}
