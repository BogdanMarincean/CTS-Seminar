package ro.ase.cts.Program;

import ro.ase.cts.Clase.Parlament;
import ro.ase.cts.Clase.ParlamentLazy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parlament parlament1 = Parlament.getInstance();
		Parlament parlament2 = Parlament.getInstance();
		
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		
		System.out.println("-----------------------------");
		
		parlament1.setTara("Romania");
		parlament2.setDenumireSediu("Undeva");
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		
		System.out.println("-----------------------------");

		ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Serbia", 400, 8, "Undeva in Serbia");
		ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK", 350, 10, "Tot in UK");
		
		System.out.println(parlamentLazy1.toString());
		System.out.println(parlamentLazy2.toString());
	}

}
