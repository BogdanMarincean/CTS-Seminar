package ro.ase.cts.Program;

import ro.ase.cts.Clase.Mobil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil mobil1 = Mobil.getInstance("Telefon", 32, 100);
		Mobil mobil2 = Mobil.getInstance("Aparat", 50, 250);
		
		System.out.println(mobil1.toString());
		System.out.println(mobil2.toString());
	}

}
