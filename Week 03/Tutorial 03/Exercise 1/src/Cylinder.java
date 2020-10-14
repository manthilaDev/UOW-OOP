public class Cylinder extends Circle
{
    private double height =1.0;

    public Cylinder()
    {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height)
    {
        this.height = height;
    }

    public Cylinder(double radius,double height)
    {
        super(radius);
        this.height=height;
    }

    public Cylinder(double radius,double height,String color)
    {
        super(radius,color);
        this.height =height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return this.height;
    }

    public double getVolume()
    {
        // Java will only search in the Super class if methods not found within
        return super.getArea()*this.height;
    }

    @Override
    public double getArea()
    {
        return (2*Math.PI*super.getRadius()*this.height)+(2*super.getArea());
    }

    @Override
    public String toString()
    {
        return "Cylinder: Subclass of "+super.toString()+" height= "+this.height;
    }
}
