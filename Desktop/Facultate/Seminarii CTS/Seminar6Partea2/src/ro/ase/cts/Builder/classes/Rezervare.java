package ro.ase.cts.Builder.classes;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaRacoritoareInclusa;
	private boolean areMuzicaAmbientalaPersonalizata;
	private String genMuzical;
	
	public Rezervare(int codrezervare, boolean areMancareInclusa, boolean areScaunErgonomic,
			boolean areBauturaRacoritoareInclusa, boolean areMuzicaAmbientalaPersonalizata, String genMuzical) {
		super();
		this.codRezervare = codrezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
		this.genMuzical = genMuzical;
	}

	public void setCodRezervare(int codrezervare) {
		this.codRezervare = codrezervare;
	}

	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}

	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}

	public void setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
		this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
	}

	public void setAreMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
		this.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
	}

	public void setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [codrezervare=");
		builder.append(codRezervare);
		builder.append(", areMancareInclusa=");
		builder.append(areMancareInclusa);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areBauturaRacoritoareInclusa=");
		builder.append(areBauturaRacoritoareInclusa);
		builder.append(", areMuzicaAmbientalaPersonalizata=");
		builder.append(areMuzicaAmbientalaPersonalizata);
		builder.append(", genMuzical=");
		builder.append(genMuzical);
		builder.append("]");
		return builder.toString();
	}
	
}
