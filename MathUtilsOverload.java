public class MathUtilsOverload {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathUtilsOverload mu = new MathUtilsOverload();
        System.out.println("add(2, 3) = " + mu.add(2, 3));
        System.out.println("add(1, 2, 3) = " + mu.add(1, 2, 3));
        System.out.println("add(2.5, 3.2) = " + mu.add(2.5, 3.2));
        System.out.println("add(\"Hello\", \" World\") = " + mu.add("Hello", " World"));
    }
}
