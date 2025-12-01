public class RecursionExample {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println("5! = " + res);
    }
}
