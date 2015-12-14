package Simulator;

import Getraenk.Espresso;
import Getraenk.Getraenk;
import Getraenk.Getraenk.Groesse;
import Getraenk.Hausmischung;
import Zutaten.Milchschaum;
import Zutaten.Schoko;
import Zutaten.Soja;

public class SternenbackKaffee {
	
	public static void main(String[] args) {
		Getraenk getraenk = new Espresso();
		System.out.println(getraenk.getBeschreibung() + " " +  getraenk.preis() + " CHF");
	

		Getraenk getraenk2 = new Hausmischung();
		getraenk2.setGroesse(Groesse.VENTI);
		getraenk2 = new Soja(getraenk2);
		getraenk2 = new Schoko(getraenk2);
		getraenk2 = new Milchschaum(getraenk2);
		System.out.println(getraenk2.getBeschreibung()  + " " + getraenk2.preis() + " CHF");
	
	}	
}
