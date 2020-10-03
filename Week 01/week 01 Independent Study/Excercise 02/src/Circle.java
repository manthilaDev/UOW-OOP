public class Circle
{
    private double radius;
    private String color;

    public Circle()
    {
        this.radius =1;
        this.color ="Blue";
    }

    public Circle(double r)
    {
        this.radius=r;
        this.color="Blue";
    }

    public Circle(double r,String c)
    {
        this.radius=r;
        this.color=c;
    }

    public void setRadius(double radius)
    {
        this.radius =radius;
    }

    public void setColor(String color)
    {
        this.color =color;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return (Math.pow(radius,2))*Math.PI;
    }

    public String getColor()
    {
        return this.color;
    }

    public String toString()
    {
        return "The Radius: "+getRadius()+" The Color is : "+getColor();
    }


}