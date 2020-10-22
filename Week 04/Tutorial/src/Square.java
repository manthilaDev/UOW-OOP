public class Square extends GeometricObject
{
    double side;

    public Square()
    {
        super();

    }

    public Square(double side)
    {
        this.side =side;
    }

    public Square(double side,String color,boolean filled)
    {
        super(color, filled);
        this.side = side;
    }

    public double getSide() 
    {
        return side;
    }

    public void setSide(double side) 
    {
        this.side = side;
    }

    @Override
    public double getArea() 
    {    
        return Math.pow(side,2);
    }

    @Override
    public double getPerimeter() 
    {    
        return 4*side;
    }

    @Override
    public String getShape() 
    {
        return "Square";
    }

    @Override
    public String toString() {
        
        return super.toString()+" This Square with sides :"+this.side;
    }
}
