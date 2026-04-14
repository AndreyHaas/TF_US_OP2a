package tag02.LösungMitDozent;

public class Website implements Beobachter {

  private String websiteAdresse;

  public Website(String websiteAdresse) {
    this.websiteAdresse = websiteAdresse;
  }

  public void update(String s) {
    System.out.println("**** An Website www." + websiteAdresse + " wird Nachricht gesendet...");
    System.out.println(s + "\n");
  }
}
