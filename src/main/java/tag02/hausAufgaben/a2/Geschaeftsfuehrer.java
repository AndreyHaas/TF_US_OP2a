package tag02.hausAufgaben.a2;

/**
 * Klasse Geschaeftsfuehrer - implementiert KundeGruessend
 * Die KI sagt "Irasshaimase!!!" (mit drei Rufzeichen)
 */
class Geschaeftsfuehrer implements KundeGruessend {
  @Override
  public void gruessen() {
    System.out.println("Geschaeftsfuehrer: Irasshaimase!!!");
  }
}