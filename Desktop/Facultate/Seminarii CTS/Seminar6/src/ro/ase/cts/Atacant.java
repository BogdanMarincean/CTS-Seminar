package ro.ase.cts;

public class Atacant extends Jucator{

	public Atacant(String nume, int nrTricou) {
		super(nume, nrTricou);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant [getNume()=");
		builder.append(getNume());
		builder.append(", getNrTricou()=");
		builder.append(getNrTricou());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	

}
