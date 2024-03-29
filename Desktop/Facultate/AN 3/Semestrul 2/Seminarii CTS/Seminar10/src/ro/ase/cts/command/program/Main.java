package ro.ase.cts.command.program;

import ro.ase.cts.command.classes.ComandaCreare;
import ro.ase.cts.command.classes.ComandaDepunere;
import ro.ase.cts.command.classes.ComandaRetragere;
import ro.ase.cts.command.classes.Executant;
import ro.ase.cts.command.classes.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		
		Executant cont = new Executant("Gigel");
		
		ComandaCreare comandaCreare = new ComandaCreare(cont, 1000);
		managerComenzi.adaugaComanda(comandaCreare);
		managerComenzi.adaugaComanda(new ComandaRetragere(cont, 123));
		managerComenzi.executaComanda();
		
		managerComenzi.adaugaComanda(new ComandaDepunere(cont, 1234));
		
		managerComenzi.adaugaComanda(new ComandaRetragere(cont, 2200));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();

		
	}

}
