package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Flyweightfactory {
	private Map<String, FlyweightAbstract> clienti;
	
	
	
	public Flyweightfactory() {
		this.clienti = new HashMap<>();
	}



	public Flyweightfactory(Map<String, FlyweightAbstract> clienti) {
		this.clienti = clienti;
	}



	public FlyweightAbstract getClient(String nrTelefon)
	{
		FlyweightAbstract client = clienti.get(nrTelefon);
		if(client == null)
		{
			client = new Client("Gigel", "123456789", "dada@gmail.com");
			clienti.put(nrTelefon, client);
		}
		return client;
	}
}
