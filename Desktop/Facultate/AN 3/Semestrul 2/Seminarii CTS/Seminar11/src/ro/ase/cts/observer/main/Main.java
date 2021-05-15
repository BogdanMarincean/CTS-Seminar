package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		ManagerSala managerSala = new ManagerSala("Ionel");
		
		ClientAbonat clientAbonat1 = new ClientAbonat("Popescu");
		ClientAbonat clientAbonat2 = new ClientAbonat("Georgescu");
		
		managerSala.adaugaAbonat(clientAbonat1);
		managerSala.adaugaAbonat(clientAbonat2);
		
		managerSala.anuntaMeci("Fotbal");
		managerSala.stergereAbonat(clientAbonat2);
		System.out.println("--------------");
		
		managerSala.anuntaMeci("Volei");
		System.out.println("--------------");
		
		ClientAbonat clientAbonat3 = new ClientAbonat("Mirela");
		managerSala.adaugaAbonat(clientAbonat3);
		managerSala.anuntaMeci("Baschet");
	}

}
