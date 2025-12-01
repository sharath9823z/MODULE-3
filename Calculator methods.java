class Calculator {
    int a, b;

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }

    int multiply() {
        return a * b;
    }
}

public class CalculatorMethods {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 20);
        System.out.println("Addition: " + calc.add());
        System.out.println("Multiplication: " + calc.multiply());
    }
}
