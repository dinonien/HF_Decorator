package Zutaten;

import Getraenk.Getraenk;

public abstract class ZutatDekorierer extends Getraenk {
	public Getraenk getraenk;
	
	public abstract String getBeschreibung();
	
	public Groesse getSize() {
		return getraenk.getGroesse();
	}

}
