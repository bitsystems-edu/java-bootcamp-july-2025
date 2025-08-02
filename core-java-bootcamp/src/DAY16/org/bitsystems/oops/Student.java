package DAY16.org.bitsystems.oops;

public class Student {
//        // Attributes.
//        private long id;
//        String name;
//        protected int age;
//        String standard;
//        public int rollNumber;


    private long id;
    private String name;
    private int age;
    private String standard;
    private int rollNumber;

    //Getter and setter.


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStandard() {
        return standard;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Behaviours
    public String Studying(){
        return null;
    }
    public void qulifyingExam(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.age);

    }
}
