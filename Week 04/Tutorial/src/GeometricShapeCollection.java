import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection
{
    private ArrayList <GeometricObject> shapeList;
    private int numObject;

    public GeometricShapeCollection(int listLength)
    {
        this.numObject =listLength;
        shapeList = new ArrayList<GeometricObject>();
    }

    @Override
    public void addShape(GeometricObject shape) {
        if(shapeList.size()<numObject)
        {
            shapeList.add(shape);
        }
        else
            System.out.println("No more space in the list");
        
    }

    @Override
    public void printShapeList() 
    {
        /*
        * Goes through the existing list of shapes and print their attributes
        */
        for(int i=0;i<shapeList.size();i++)
        {
            if(shapeList.get(i).getShape().equals("Circle"))
            {
                System.out.println("Shape = Circle, Area = "+ shapeList.get(i).getArea()
                +", Perimeter = "+shapeList.get(i).getPerimeter());
            }else if(shapeList.get(i).getShape().equals("Rectangle"))
            {
                System.out.println("Shape = Rectangle, Area = "+shapeList.get(i).getArea()
                +", Perimeter = "+shapeList.get(i).getPerimeter());
            }else if(shapeList.get(i).getShape().equals("Square"))
            {
                System.out.println("Shape = Square, Area = "+shapeList.get(i).getArea()
                +", Perimeter = "+shapeList.get(i).getPerimeter());
            }
        }
        
    }

    @Override
    public boolean runMenu() {
        boolean exit =false;
        
        System.out.println("To add a New Shape press 1");;
        System.out.println("To print the list of the shape press 2");
        System.out.println("To exit press 3");

        Scanner scn = new Scanner(System.in);
        int choise =scn.nextInt();

        switch(choise)
        {
            case 1:
            System.out.println("Press 1 if you want to add Circle");
            System.out.println("Press 2 if you want to add Rectangle");
            System.out.println("Press 3 if you want to add Square");

            int choise2 = scn.nextInt();
            scn.nextLine();

            System.out.println("Enter the color of your shape");
            String colour = scn.nextLine();

            System.out.println("Is it filled? (y/n)");
            String isFilled = scn.nextLine();
            boolean filled = false;
            
            if (isFilled.equals("y")) 
                filled = true;
            else if (isFilled.equals("n"))
               filled = false;            
            else
               System.out.println("Please enter y or n, if the  shape is filled or not respectively");


                switch (choise2)
                {
                    case 1:
                    //Create a Circle 
                    System.out.println("Insert the radius");
                    int radius =scn.nextInt();
                    this.addShape(new Circle(radius,colour,filled));
                    break;

                    case 2:
                    // Create a rectangle
                    System.out.println("Insert the length ");
                    int length =scn.nextInt();
                    System.out.println("Insert the width");
                    int width =scn.nextInt();
                    this.addShape(new Rectangle(length, width));
                    break;

                    case 3:
                    // create a Square
                    System.out.println("Insert length");
                    int side = scn.nextInt();
                    this.addShape(new Square(side));
                    break;
                }
            break; // End of Shape creation segment

            case 2:
            // listing out the established shapes
            this.printShapeList();
            break;

            case 3:

            // Exit segment 
            exit =true;
            break;
        }

        return exit;
    }
    
}
