class StudentStatic {
    static int count = 0;
    StudentStatic() { count++; }
}

class MathUtilsStatic {
    static int square(int x) {
        return x * x;
    }
}

class DemoStatic {
    static int data;
    static {
        data = 100;
        System.out.println("Static block: data set to " + data);
    }
}

public class StaticMembersDemo {
    public static void main(String[] args) {
        new StudentStatic();
        new StudentStatic();
        System.out.println(StudentStatic.count);

        int s = MathUtilsStatic.square(5);
        System.out.println("s = " + s);

        int d = DemoStatic.data;
    }
}
