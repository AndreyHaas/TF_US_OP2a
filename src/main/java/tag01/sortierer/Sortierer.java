package tag01.sortierer;

// Kontextklasse
// enthält ein privates Attribut von dem Interface
// und eine Methode, die die Interfacemethode aufruft
public class Sortierer {

  // Attribut des Interfaces
  private Sortieralgorithmus algo;

  // getter und Setter zum Attribut
  public Sortieralgorithmus getAlgo() {
    return algo;
  }

  public void setAlgo(Sortieralgorithmus algo) {
    this.algo = algo;
  }


  // eine Methode, die die Interfacemethode aufruft
  public void sortiere(int[] arr) {
    algo.sortiere(arr);
  }
}