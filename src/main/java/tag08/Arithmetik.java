package tag08;

public class Arithmetik {

    private int addition(int a, int b) {
        return a + b;
    }

    private int subtraction(int a, int b) {
        return a - b;
    }

    private int multiplication(int a, int b) {
        return a * b;
    }

    private int division(int a, int b) {
        if (b != 0) {
            return a / b;
        }

        throw new ArithmeticException("Division durch Null ist nicht erlaubt");
    }

    public int getOperation(Operation operation, int a, int b) {
        return switch (operation) {
            case ADD -> addition(a, b);
            case SUB -> subtraction(a, b);
            case MUL -> multiplication(a, b);
            case DIV -> division(a, b);
        };
    }
}
