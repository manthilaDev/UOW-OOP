import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BookTest 
{
    private static ArrayList<Book> bookList =new ArrayList<>();
    private static HashMap<Book, Integer>hMap = new HashMap<Book,Integer>();
    
    private static void displayBookList()
    {
        for(int i=0;i<bookList.size();i++)
        {
            System.out.println(i+1+" "+bookList.get(i).toString());
        }
    }

    private static void addBook()
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the Book title :");
        String title =scn.nextLine();
        System.out.println("Enter the Author name :");
        String name =scn.nextLine();
        System.out.println("Enter the year :");
        int year =scn.nextInt();
        System.out.println("Enter the price :");
        double price = scn.nextDouble();
        bookList.add(new Book(title, name, year,price));

    }

    public static void sortDisplay()
    {
        Collections.sort(bookList);
        displayBookList();
    }

    public static void addToShelf()
    {
        for(int i=0;i<bookList.size();i++)
        {
            Scanner scn =new Scanner(System.in);
            System.out.println("Please enter the number of the shelf where is placed the book"+
            bookList.get(i).getTitle());
            int numShelf =scn.nextInt();
            hMap.put(bookList.get(i),numShelf); 
        }
    }

    public static void findBook()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insert the number of the shelf");
        int selectedShelf =scn.nextInt();
        System.out.println("The book in shelf"+selectedShelf+" are: ");
        System.out.println("Insert the number of the shelf");
        Set set = hMap.entrySet();
        Iterator iterator =set.iterator();

        while(iterator.hasNext())
        {
            Map.Entry entry = (Map.Entry)iterator.next();

            if(selectedShelf == (int) entry.getValue())
            {
                System.out.println(((Book)entry.getKey()).getTitle());

            }
            
        }
    }
    public static void main(String []args)
    {
        mainLoop:while(true)
        {
        Scanner scn =new Scanner(System.in);
        System.out.println("1. Add new Book ");
        System.out.println("2. List the Books available");
        System.out.println("3. Show the sorted list of books");
        System.out.println("4. Assign shelf value");
        System.out.println("0. Exit Application ");

        int userIn =scn.nextInt();
            switch(userIn)
            {
                case 0:
                System.out.println("Application will terminate itself");
                scn.close();
                break mainLoop;

                case 1:
                addBook();
                break;

                case 2:
                displayBookList();
                break;

                case 3:
                sortDisplay();
                break;
                
                case 4:
                addToShelf();
                break;

                case 5:
                findBook();
                break;

                default:
                System.out.println("Invalid option selected !!!");
                break;
            }
        }
    }    
}
