public class StudentSimple {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        StudentSimple s1 = new StudentSimple();
        s1.name = "Kishan";
        s1.age = 21;
        s1.display();
    }
}
