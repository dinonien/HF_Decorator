package Zutaten;

import Getraenk.Getraenk;

public class Schoko extends ZutatDekorierer {
	Getraenk getraenk;
	
	public Schoko(Getraenk getraenk) {
		this.getraenk = getraenk;
	}
	
	@Override
	public String getBeschreibung() {
		return getraenk.getBeschreibung() + ", Schoko";
	}

	@Override
	public double preis() {
		return .20 + getraenk.preis();
	}

}
