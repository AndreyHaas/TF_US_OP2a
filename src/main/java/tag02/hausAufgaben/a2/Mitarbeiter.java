package tag02.hausAufgaben.a2;

class Mitarbeiter implements KundeGruessend {
  @Override
  public void gruessen() {
    System.out.println("Mitarbeiter: Irasshaimase!");
  }
}