package ro.ase.cts.memento.main;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.Meci;

public class Main {

	public static void main(String[] args) {
		ManagerMemento manager = new ManagerMemento();
		
		Meci meci1 = new Meci("Craiova", "Steaua", 2304, 1204, 50);
		manager.adaugaMemento(meci1.creareMemento());
		
		meci1.setEchipaGazda("Rapid");
		meci1.setNrSpectatori(153);
		
		manager.adaugaMemento(meci1.creareMemento());
		
		System.out.println(meci1.toString());
		System.out.println("---------------------------");
		
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1.toString());
		
		System.out.println("---------------------------");
		meci1.setMemento(manager.getLastMemento());
		System.out.println(meci1.toString());
	}

}
