package ro.ase.cts.Clase;

public class Mobil {
	private String tip;
	private int memorie;
	private float greutate;

	private static Mobil mobil = null;
	
	public static Mobil getInstance(String tip, int memorie, float greutate)
	{
		if(mobil==null)
		{
			mobil = new Mobil(tip, memorie, greutate);
		}
		return mobil;
	}
	
	private Mobil() {
		super();
		this.tip = "";
		this.memorie = 0;
		this.greutate = 0;
	}

	private Mobil(String tip, int memorie, float greutate) {
		super();
		this.tip = tip;
		this.memorie = memorie;
		this.greutate = greutate;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public void setMemorie(int memorie) {
		this.memorie = memorie;
	}

	public void setGreutate(float greutate) {
		this.greutate = greutate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mobil [tip=");
		builder.append(tip);
		builder.append(", memorie=");
		builder.append(memorie);
		builder.append(", greutate=");
		builder.append(greutate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
