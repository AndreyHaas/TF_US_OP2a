package tag04.unterricht.u2;

import java.util.Random;

public class TemperaturSensor {

  Random random = new Random();

  private double messwertKelvin = 240 + random.nextDouble() * 80;

  public double getTemperatur() {
    return messwertKelvin;
  }

  public void setMesswertKelvin(double messwertKelvin) {
    this.messwertKelvin = messwertKelvin;
  }

  public String getEinheit() {
    return "Kelvin";
  }
}
