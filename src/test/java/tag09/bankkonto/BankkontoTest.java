package tag09.bankkonto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankkontoTest {

  Bankkonto konto;

  @BeforeEach
  void setUp() {
    konto = new Bankkonto(100);
  }

  @Test
  void einzahlen() {
    assertEquals(150, konto.einzahlen(50));
  }

  @Test
  void abheben() {
  }

  @Test
  void getGuthaben() {
  }
}