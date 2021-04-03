package ro.ase.cts;

public abstract class Jucator {
	private String nume;
	private int nrTricou;
	
	public Jucator(String nume, int nrTricou) {
		this.nume = nume;
		this.nrTricou = nrTricou;
	}

	public String getNume() {
		return nume;
	}

	public int getNrTricou() {
		return nrTricou;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [nume=");
		builder.append(nume);
		builder.append(", nrTricou=");
		builder.append(nrTricou);
		builder.append("]");
		return builder.toString();
	}
}
