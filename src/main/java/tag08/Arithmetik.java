package tag08;

import java.util.StringJoiner;

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
        return a / b;
    }

    public int getOperation(Operation operation, int a, int b) {
        return switch (operation) {
            case ADD -> addition(a, b);
            case SUB -> subtraction(a, b);
            case MUL -> multiplication(a, b);
            case DIV -> division(a, b);
        };
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", getClass().getSimpleName() + "[", "]")
                .toString();
    }
}
