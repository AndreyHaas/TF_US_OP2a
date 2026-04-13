package tag01.aufgaben.lösung_4.unrefaktorisiert;

// Einfache Modelklasse (POJO). 
public class Adresse {
	
	private String name;
	private String strasse;
	private String stadt;
	private String postleitzahl;
	private String land;
	
	Adresse(String name, String strasse, String stadt, String postleitzahl, String land){
		this.name = name;
		this.strasse = strasse;
		this.stadt = stadt;
		this.postleitzahl = postleitzahl;
		this.land = land;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	public String getPostleitzahl() {
		return postleitzahl;
	}
	public void setPostleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}	
}
