package ro.ase.cts.observer.clase;

public class ClientAbonat implements Observer{

	public String numeClient;
	
	public ClientAbonat(String numeClient) {
		super();
		this.numeClient = numeClient;
	}
	
	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println("Clientul " + this.numeClient + "a receptionat mesajul " + mesaj);
	}
}
