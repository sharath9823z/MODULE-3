public class StudentThisKeyword {
    private String name;
    private int age;
    private String course;

    public StudentThisKeyword() {
        this("Unknown", 0, "Not Assigned");
        System.out.println("Default constructor called");
    }

    public StudentThisKeyword(String name, int age) {
        this(name, age, "General");
        System.out.println("Two-parameter constructor called");
    }

    public StudentThisKeyword(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Three-parameter constructor called");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        StudentThisKeyword s1 = new StudentThisKeyword();
        s1.display();

        StudentThisKeyword s2 = new StudentThisKeyword("Aman", 21);
        s2.display();

        StudentThisKeyword s3 = new StudentThisKeyword("Neha", 22, "Computer Science");
        s3.display();
    }
}
