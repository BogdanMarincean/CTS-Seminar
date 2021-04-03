package ro.ase.cts;

public class Fundas extends Jucator{

	public Fundas(String nume, int nrTricou) {
		super(nume, nrTricou);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundas [getNume()=");
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
