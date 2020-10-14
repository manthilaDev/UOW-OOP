public class Circle
{
    private double radius =1.0;
    private String color = "blue";

    public Circle()
    {
        this.radius =1.0;
        this.color="blue";
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius,String color)
    {
        this.radius =radius;
        this.color= color;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius =radius;
    }

    public String getColor()
    {
        return this.color;
    }

    public void SetColor(String color)
    {
        this.color =color;
    }

    public double getArea()
    {
        return Math.PI*Math.pow(this.radius, 2);
    }

    public String toString()
    {
        return "Circle Radius is :"+this.radius+"\ncolor of "+this.color;
    }
}   