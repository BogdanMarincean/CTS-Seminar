package ro.ase.cts.problemacomposite.program;

import ro.ase.cts.problemacomposite.clase.Produs;
import ro.ase.cts.problemacomposite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		Sectiune bauturi = new Sectiune("bauturi");
		Sectiune desert = new Sectiune("desert");
		
		Produs cola = new Produs("Cola");
		Produs tiramisu = new Produs("Tiramisu");
		Produs frappe = new Produs("Frappe");
		
		bauturi.adaugaNod(cola);
		bauturi.adaugaNod(frappe);
		desert.adaugaNod(tiramisu);
		
		Sectiune meniu = new Sectiune("Meniu");
		meniu.adaugaNod(bauturi);
		meniu.adaugaNod(desert);
		
		meniu.printareElement();
		System.out.println("--------------------------");
		
		desert.adaugaNod(frappe);
		bauturi.stergeNod(frappe);
		
		meniu.printareElement();
	}

}
