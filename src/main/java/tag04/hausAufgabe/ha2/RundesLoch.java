package tag04.hausAufgabe.ha2;

// ============================================================
// Klasse RundesLoch (gegeben)
// ============================================================
class RundesLoch {
  private double radius;

  public RundesLoch(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public boolean pruefeObStoepselPasst(RunderStoepsel stoepsel) {
    if (stoepsel.getRadius() <= radius)
      return true;
    return false;
  }
}

