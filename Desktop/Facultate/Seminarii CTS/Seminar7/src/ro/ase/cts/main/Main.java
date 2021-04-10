package ro.ase.cts.main;

import ro.ase.cs.classes.AdapterLeasing;
import ro.ase.cs.classes.AdapterLeasingClase;
import ro.ase.cs.classes.Creditable;
import ro.ase.cs.classes.Leasing;

public class Main {
	
	public static void printeazaInformatiiCredit(Creditable credit)
	{
		credit.crediteaza();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leasing leasing = new Leasing("Bogdan", 10000);
		AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
		adapterLeasing.crediteaza();
		System.out.println("--------------");
		printeazaInformatiiCredit(adapterLeasing);
		System.out.println("------------------------------");
		AdapterLeasingClase adapterLeasingClase = new AdapterLeasingClase("Gigel", 123456);
		printeazaInformatiiCredit(adapterLeasingClase);
	}

}
