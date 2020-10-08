public class Test {
    public static void main(String[] args) {
        Director director = new Director("James", "Cameron");

        Date dob = new Date(16,8,1954);
        director.setDateOfBirth(dob);

        director.setNumberOfMovie(39);
        System.out.println(director);
        System.out.println("Name is :"+ director.getName());
        System.out.println("Surname is :"+director.getSurname());
        System.out.println("Dob is :"+director.getDOB());
        System.out.println("Number of directed movies is: "+director.getNumberOfMovie());
    }
}
