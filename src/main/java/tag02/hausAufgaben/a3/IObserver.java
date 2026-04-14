package tag02.hausAufgaben.a3;

/**
 * Interface IObserver fuer die Werkstatt
 */
@FunctionalInterface
interface IObserver {
  void update(String nachricht);
}