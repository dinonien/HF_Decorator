package Zutaten;

import Getraenk.Getraenk;

public class Milchschaum extends ZutatDekorierer {
	Getraenk getraenk;
	
	public Milchschaum(Getraenk getraenk) {
		this.getraenk = getraenk;
	}

	@Override
	public String getBeschreibung() {
		return getraenk.getBeschreibung() + ", Milchschaum";
	}

	@Override
	public double preis() {
		return 0.1 + getraenk.preis();
	}

}
