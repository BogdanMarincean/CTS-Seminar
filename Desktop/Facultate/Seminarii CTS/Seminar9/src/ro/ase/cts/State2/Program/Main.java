package ro.ase.cts.State2.Program;

import ro.ase.cts.State2.Classes.Masa;
import ro.ase.cts.State2.Classes.StareLibera;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		masa.elibereazaMasa();
		masa.ocupaMasa();
//		masa.setStare(new StareLibera()); am pus seterul pe default pentru a nu putea fi folosit de aici
		masa.rezervaMasa();
		masa.elibereazaMasa();
	}

}
