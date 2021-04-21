package ro.ase.cts.State.Program;

import ro.ase.cts.State.Classes.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		masa.cerereEliberare();
		masa.cerereRezervare();
		masa.cerereOcupare();
		masa.cerereRezervare();
		masa.cerereEliberare();
	}

}
