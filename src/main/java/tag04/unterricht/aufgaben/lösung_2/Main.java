package tag04.unterricht.aufgaben.lösung_2;

public class Main {
  public static void main(String[] args) {

    RundesLoch loch = new RundesLoch(7);
    RunderStoepsel stoepsel = new RunderStoepsel(7);

    System.out.println("Stoepsel passt in das Loch: " + (loch.pruefeObStoepselPasst(stoepsel)));

    QuadratischerStoepsel kleinerQuadratischerStoepsel = new QuadratischerStoepsel(5);
    QuadratischerStoepsel grosserQuadratischerStoepsel = new QuadratischerStoepsel(10);

    QuadratStoepselAdapter kleinerQuadratStoepselAdapter = new QuadratStoepselAdapter(
        kleinerQuadratischerStoepsel);
    QuadratStoepselAdapter grosserQuadratStoepselAdapter = new QuadratStoepselAdapter(
        grosserQuadratischerStoepsel);

    System.out.println("Stoepsel passt in das Loch: " + (loch.pruefeObStoepselPasst(
        kleinerQuadratStoepselAdapter))); // true
    System.out.println("Stoepsel passt in das Loch: " + (loch.pruefeObStoepselPasst(
        grosserQuadratStoepselAdapter))); // false
  }
}
