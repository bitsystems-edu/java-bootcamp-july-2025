package DAY17.org.bitsystems.oops2;

public class Student {
   private long id;
   private String name;
   private int age;
   private int rollNumber;

   // If there is no constructor crated by user, programming language will automatically
   // create one, which is known as default constructor.

    public Student () {
        // Empty Constructor
    }

    public Student (Student std) {
        this.id = std.id;
        this.name = std.name;
        this.age = std.age;
        this.rollNumber = std.rollNumber;
    }

    // Custom Constructor: Constructors created by user/programmers.
    // Prarameterised constuctors are constructors with parameter.
    public Student (long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(long id, String name, int age, int rollNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void getMyDetails(String city) {
        System.out.println("My city is " + city);
    }
}
