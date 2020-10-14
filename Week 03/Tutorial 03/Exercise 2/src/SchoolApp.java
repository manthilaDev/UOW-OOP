public class SchoolApp 
{
    public static void main(String []args)

    {
        Person jack = new Person("Jack Brooke", 27, "M"); 
        System.out.println(jack); 
        Student beth = new Student("Elisabeth Smith", 16, "F", Integer.parseInt("122233")); 
        System.out.println(beth); 
        Teacher sam = new Teacher("Sam Hamilton", 34, "M", "Computer Science", 50000);
        System.out.println(sam); 

        /*
        * Variables types falls under Super
        */
        Person p =new Teacher("Sam Hamilton",32,"M","Computer Science",50000);
        Teacher t =new Teacher("Sam Hamilton",34,"M","Computer Science",50000);
        Person s =new Student("Elisabeth Smith",16,"F",Integer.parseInt("122233"));

        System.out.println(p);
        System.out.println(t);
        System.out.println(s);
    }
    
}
