package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements AbstractPrototype{
	private List<String> denumireSolutii;
	private List<Integer> cantitati;
	
	public Reteta() {
		super();
	}
	
	public Reteta(List<String> denumireSolutii, List<Integer> cantitati) {
		super();
		this.denumireSolutii = denumireSolutii;
		//avem nevoie de validari
		this.cantitati = cantitati;
	}
	
	public List<String> getDenumireSolutii() {
		return denumireSolutii;
	}
	public void setDenumireSolutii(List<String> denumireSolutii) {
		this.denumireSolutii = denumireSolutii;
	}
	public List<Integer> getCantitati() {
		return cantitati;
	}
	public void setCantitati(List<Integer> cantitati) {
		this.cantitati = cantitati;
	}
	
	@Override
	public AbstractPrototype copiaza() {
		Reteta copie = new Reteta();
		copie.cantitati = new ArrayList<>();
		copie.cantitati.addAll(this.cantitati);
		copie.denumireSolutii = new ArrayList<>();
		copie.denumireSolutii.addAll(this.denumireSolutii);
		return copie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [denumireSolutii=");
		builder.append(denumireSolutii);
		builder.append(", cantitati=");
		builder.append(cantitati);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
