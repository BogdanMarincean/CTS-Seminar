package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
	public List<Observer> listaObserveri;
	
	public Subiect() {
		this.listaObserveri = new ArrayList<>();
	}
	
	public void adaugaAbonat(Observer observer)
	{
		this.listaObserveri.add(observer);
	}
	public void stergereAbonat(Observer observer)
	{
		this.listaObserveri.remove(observer);
	}
	public void trimitereNotificare(String mesaj)
	{
		for(Observer observer : listaObserveri)
		{
			observer.receptionareMesaj(mesaj);
		}
	}
}
