public class Test {
    public static void main(String[] args) {
        Director director = new Director("Manthila", "Walgamage");

        Date dob = new Date(16,8,1999);
        director.setDateOfBirth(dob);

        director.setNumberOfMovie(23);
        System.out.println("Name is :"+ director.getName());
        System.out.println("Surname is :"+director.getSurname());
        System.out.println("Dob is :"+director.getDOB().toString(director.getDOB().getDay(),director.getDOB().getMonth(),
        director.getDOB().getYear()));
        System.out.println("Number of directed movies is: "+director.getNumberOfMovie());
    }
}
