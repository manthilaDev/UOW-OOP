import java.util.Scanner;
import java.util.ArrayList;
public class Application 
{
    Student student =new Student();
    Module module =new Module();
    ArrayList<Student> studentArray = new ArrayList<Student>();
    public static void main(String [] args)
    {
        Application obj =new Application();
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the module :");
        obj.module.setName(scn.nextLine());
        obj.student.setModule(obj.module);
        System.out.println("Please enter student first name :");
        obj.student.setFirstName(scn.nextLine());
        System.out.println("Please enter student last name :");
        obj.student.setLastName(scn.nextLine());
        System.out.println("Please enter the registration number :");
        obj.student.setRegNo(scn.nextLine());
        System.out.println("System Please enter assignment one marks");
        obj.student.setAssignmentOneMarks(Integer.parseInt(scn.nextLine()));
        System.out.println("System Please enter assignment two marks");
        obj.student.setAssignmentTwoMarks(Integer.parseInt(scn.nextLine()));
        System.out.println("Please enter the design marks :");
        obj.student.SetDesignMarks(Integer.parseInt(scn.nextLine()));
        System.out.println("Please enter the implementation marks :");
        obj.student.setImplementationMarks(Integer.parseInt(scn.nextLine()));
        System.out.println("Please enter the final exam marks :");
        obj.student.setFinalExamMark(Integer.parseInt(scn.nextLine()));
        scn.close();
        System.out.println(obj.student.getModuleName());
        System.out.println(obj.student.getFirstName());
        System.out.println(obj.student.getLastName());
        System.out.println(obj.student.getRegNo());
        System.out.println(obj.student.getAssignmentOneMarks());
        System.out.println(obj.student.getAssignmentTwoMarks());
        System.out.println(obj.student.getDesignMarks());
        System.out.println(obj.student.getImplementationMarks());
        System.out.println(obj.student.getFinalExamMarks());


    }
}
