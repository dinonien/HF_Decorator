package Getraenk;

public abstract class Getraenk {
	public enum Groesse { TALL, GRANDE, VENTI};
	Groesse groesse = Groesse.TALL;
	
	String beschreibung = "Unbekanntes Getränk";
	
	public String getBeschreibung() {
		return beschreibung;
	}
	
	public void setGroesse(Groesse groesse) {
		this.groesse = groesse;
	}
	
	public Groesse getGroesse() {
		return this.groesse;
	}
	
	public abstract double preis();
}
