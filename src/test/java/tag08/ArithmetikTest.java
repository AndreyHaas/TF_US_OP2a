package tag08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithmetikTest {

    Arithmetik arithmetik = new Arithmetik();

    @Test
    void getAdditionalOperation() {
        assertEquals(4, arithmetik.getOperation(Operation.ADD, 2, 2));
    }

    @Test
    void getSubtractionOperation() {
        assertEquals(0, arithmetik.getOperation(Operation.SUB, 2, 2));
    }

    @Test
    void getMultiplicationOperation() {
        assertEquals(4, arithmetik.getOperation(Operation.MUL, 2, 2));
    }

    @Test
    void getDivisionOperation() {
        assertEquals(1, arithmetik.getOperation(Operation.DIV, 2, 2));
    }

    @Test
    void getDivisionByZeroOperation() {
        ArithmeticException exception =
                assertThrows(ArithmeticException.class, () -> arithmetik.getOperation(Operation.DIV, 2, 0));

        assertEquals("Division durch Null ist nicht erlaubt", exception.getMessage());
    }
}