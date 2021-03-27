package ro.ase.cts.factory.clase;

public class Medic extends PersonalMedical{

	public Medic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medic(String nume, float salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic [");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
