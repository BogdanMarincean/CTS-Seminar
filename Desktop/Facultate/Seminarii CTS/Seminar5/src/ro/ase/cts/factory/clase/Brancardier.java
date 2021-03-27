package ro.ase.cts.factory.clase;

public class Brancardier extends PersonalMedical{

	public Brancardier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brancardier(String nume, float salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier [");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
