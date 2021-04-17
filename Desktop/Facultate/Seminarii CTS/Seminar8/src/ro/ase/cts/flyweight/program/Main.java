package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Flyweightfactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(1, 1);
		Rezervare rezervare2 = new Rezervare(2, 1);
		Rezervare rezervare3 = new Rezervare(3, 1);
		
		Flyweightfactory flyweightfactory = new Flyweightfactory();
		
		flyweightfactory.getClient("123456").printeazaRezervare(rezervare1);
		flyweightfactory.getClient("987654").printeazaRezervare(rezervare2);
		flyweightfactory.getClient("123456").printeazaRezervare(rezervare3);
	}

}
