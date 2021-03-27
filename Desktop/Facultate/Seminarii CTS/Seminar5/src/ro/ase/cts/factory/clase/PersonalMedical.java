package ro.ase.cts.factory.clase;

public abstract class PersonalMedical {
	private String nume;
	private float salariu;
	
	public PersonalMedical() {
		super();
	}

	public PersonalMedical(String nume, float salariu) {
		super();
		this.nume = nume;
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonalMedical [nume=");
		builder.append(nume);
		builder.append(", salariu=");
		builder.append(salariu);
		builder.append("]");
		return builder.toString();
	}
	
}
