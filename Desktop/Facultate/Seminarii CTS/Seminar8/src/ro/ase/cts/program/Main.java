package ro.ase.cts.program;

import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa2 = new Masa(30, 4);
		if(Facade.esteMasaPregatita(masa2))
		{
			System.out.println("Poftiti la masa!");
		}
		else
		{
			System.out.println("Masa nu este pregatita!");
		}
	}

}
