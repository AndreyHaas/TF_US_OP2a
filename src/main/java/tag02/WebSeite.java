package tag02;

public class WebSeite implements Beobachter{

  private String webSeiteAdresse;

  public WebSeite(String webSeiteAdresse) {
    this.webSeiteAdresse = webSeiteAdresse;
  }

  @Override
  public void update(String text) {
    System.out.println("\n**** An Webseite www." + webSeiteAdresse + " wird Nachricht gesendet. ****");
    System.out.println(text + "\n");
  }
}