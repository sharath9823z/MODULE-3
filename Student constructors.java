public class StudentConstructor {
    String name;
    int age;

    StudentConstructor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor("Rakesh", 23);
        s1.display();
    }
}
