package DAY17.org.bitsystems.oops2;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aditya", 22, 10);
//        s1.getId();
//        s1.getName();
        System.out.println("ID: "+s1.getId());
        System.out.println("Name: "+s1.getName());
        System.out.println("Age: "+s1.getAge());
        System.out.println("Roll Number: "+s1.getRollNumber());


        Student s2 = new Student(s1); // This is not copy constructor
        System.out.println("ID: "+s2.getId());
        System.out.println("Name: "+s2.getName());
        System.out.println("Age: "+s2.getAge());
        System.out.println("Roll Number: "+s2.getRollNumber());

        Student s3 = new Student(s2);

        System.out.println(" ======================= ");
        Child c1  = new Child();
       c1.getMyDetails("Noida");

    }
}
