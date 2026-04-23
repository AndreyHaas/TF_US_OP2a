package tag09.aufgabe.aufgabe0.lsg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  private Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void testAdd() {
    assertEquals(5, calculator.add(2, 3), "2 + 3 sollte 5 ergeben");
    assertEquals(0, calculator.add(-2, 2), "-2 + 2 sollte 0 ergeben");
    assertEquals(-5, calculator.add(-2, -3), "-2 + -3 sollte -5 ergeben");
  }

  @Test
  void testSubtract() {
    assertEquals(1, calculator.subtract(3, 2), "3 - 2 sollte 1 ergeben");
    assertEquals(-4, calculator.subtract(-2, 2), "-2 - 2 sollte -4 ergeben");
    assertEquals(1, calculator.subtract(-2, -3), "-2 - (-3) sollte 1 ergeben");
  }

  @Test
  void testMultiply() {
    assertEquals(6, calculator.multiply(2, 3), "2 * 3 sollte 6 ergeben");
    assertEquals(-4, calculator.multiply(-2, 2), "-2 * 2 sollte -4 ergeben");
    assertEquals(6, calculator.multiply(-2, -3), "-2 * -3 sollte 6 ergeben");
  }

  @Test
  void testDivide() {
    assertEquals(2, calculator.divide(6, 3), "6 / 3 sollte 2 ergeben");
    assertEquals(-2, calculator.divide(-6, 3), "-6 / 3 sollte -2 ergeben");
    assertEquals(2, calculator.divide(-6, -3), "-6 / -3 sollte 2 ergeben");
  }

  @Test
  void testDivideByZero() {
    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0),
            "Division durch Null sollte eine IllegalArgumentException werfen");
    assertEquals("Division durch Null ist nicht erlaubt", exception.getMessage());
  }
}