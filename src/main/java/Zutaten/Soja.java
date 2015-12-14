package Zutaten;

import Getraenk.Getraenk;

public class Soja extends ZutatDekorierer {
	Getraenk getraenk;
	
	public Soja(Getraenk getraenk) {
		this.getraenk = getraenk;
	}

	@Override
	public String getBeschreibung() {
		// TODO Auto-generated method stub
		return getraenk.getBeschreibung() + ", Soja";
	}

	@Override
	public double preis() {
		double preis = getraenk.preis();
		if (getraenk.getGroesse() == Groesse.TALL) {
			preis += .1;
		}
		else if (getraenk.getGroesse() == Groesse.GRANDE) {
			preis += .15;
		}
		else if (getraenk.getGroesse() == Groesse.VENTI) {
			preis += .2;
		}
		
		return preis;
	}

}
