package ro.ase.cts.factory.clase;

public class Asistent extends PersonalMedical{
	private int durataLucru;
	public Asistent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asistent(String nume, float salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	
	public Asistent(int durataLucru) {
		super();
		this.durataLucru = durataLucru;
	}
	
	public int getDurataLucru() {
		return durataLucru;
	}

	public void setDurataLucru(int durataLucru) {
		this.durataLucru = durataLucru;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent [");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
