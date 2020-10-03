public class TestCircle
{
    public static void main(String [] args)
    {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(8,"Red");
        Circle circle3 =new Circle();
        circle3.setRadius(7);
        circle3.setColor("Green");
        System.out.println("The Circle has radius of "+circle1.getRadius()+ " and area of "
        +"and area of "+circle1.getArea()+" The Color is "+circle1.getColor());
        System.out.println("The Circle has radius of "+circle2.getRadius()+ " and area of "
        +"and area of "+circle2.getArea()+" The Color is "+circle2.getColor());

        System.out.println(circle3.toString());
        //sout will automatically triger the toString method
        System.out.println(circle3);
    }
}