package ro.ase.cts.Strategy.Program;

import ro.ase.cts.Strategy.Classes.Client;
import ro.ase.cts.Strategy.Classes.PlataBonuriMasa;
import ro.ase.cts.Strategy.Classes.PlataCard;
import ro.ase.cts.Strategy.Classes.PlataCash;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Ionel", new PlataCash());
		client.platesteNota(200);
		client.setPlata(new PlataCard());
		client.platesteNota((float) 100.3);
		client.setPlata(new PlataBonuriMasa());
		client.platesteNota((float) 1000.50);
	}

}
