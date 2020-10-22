public class Rectangle extends GeometricObject
{
    double length;
    double width;
    
    public Rectangle()
    {
        super();
    }

    public Rectangle(double length,double width)
    {
        super();
        this.length=length;
        this.width=width;
    }

    public Rectangle(double length, double width, String color , boolean filled)
    {
        super(color, filled);
        this.length = length;
        this.width =width;
    }

    public double getLength() 
    {
        return length;
    }

    public void setLength(double length) 
    {
        this.length = length;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    @Override
    public double getArea() 
    {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() 
    {
        return (2*length) + (2*width);
    }

    @Override
    public String getShape() 
    {
        
        return "Rectangle";
    }

    @Override
    public String toString() {
        return super.toString()+" This is a Rectangle with length "+this.length+" width "+this.width;
    }
}
