package ro.ase.cts.flyweight.clase;

public class Rezervare {
	private int nrRezervare;
	private int nrMasa;
	
	public Rezervare(int nrRezervare, int nrMasa) {
		super();
		this.nrRezervare = nrRezervare;
		this.nrMasa = nrMasa;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrRezervare=");
		builder.append(nrRezervare);
		builder.append(", nrMasa=");
		builder.append(nrMasa);
		builder.append("]");
		return builder.toString();
	}
	
	
}
