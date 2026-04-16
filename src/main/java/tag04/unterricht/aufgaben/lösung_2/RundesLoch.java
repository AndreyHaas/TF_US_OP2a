package tag04.unterricht.aufgaben.lösung_2;

// Wir wollen einen eckigen Stoepsel in das runde Loch bekommen.
// Dafür müssen wir uns einen Adapter programmieren.
public class RundesLoch {

  private double radius;

  public RundesLoch(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public boolean pruefeObStoepselPasst(RunderStoepsel stoepsel) {
    if (stoepsel.getRadius() <= radius) {
      return true;
    }
    return false;
  }
}
