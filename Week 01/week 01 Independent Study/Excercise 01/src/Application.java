package application;
public class Application
{
    public static void main(String [] args)
    {
        System.out.println("Hello World ! ");
        Person p = new Person("Ben");
        Person d =new Person("Disney");
        Person t =new Person("Taniya");
        p.setSurname("Tennison");
        d.setSurname("Walt");
        t.setSurname("Ghul");
        p.setAge(15);
        d.setAge(80);
        t.setAge(200);
        // Displaying Details 
        p.displayName();
        System.out.println(p.getSurname());
        System.out.println(p.getAge());
        
        d.displayName();
        System.out.println(d.getSurname());
        System.out.println(d.getAge());
        
        t.displayName(); 
        System.out.println(t.getSurname());              
        System.out.println(t.getAge());

    }
}