package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantata = 30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int clasa) {
		this.clasa = clasa;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	public static float getSumaFinantata() {
		return sumaFinantata;
	}
	public static void setSumaFinantata(float sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}
	
	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte  + ", DenumireProiect="
				+ Arrays.toString(denumiriProiecte) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	@Override
	public float getFinantare() {
		return sumaFinantata;
	}
	
}
