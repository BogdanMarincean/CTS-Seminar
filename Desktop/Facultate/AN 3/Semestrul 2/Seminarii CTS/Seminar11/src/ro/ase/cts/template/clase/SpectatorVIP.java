package ro.ase.cts.template.clase;

public class SpectatorVIP extends Template{
	private String nume;
	private int nrLoja;
	
	public SpectatorVIP(String nume, int nrLoja) {
		super();
		this.nume = nume;
		this.nrLoja = nrLoja;
	}

	@Override
	public void seAsazaLaCoada() {
	}

	@Override
	public void prezintaBilet() {
		System.out.println(this.nume + " prezinta biletul pentru loja");
	}

	@Override
	public void seFaceControlCorporal() {
		System.out.println("S-a facut control pentru " + this.nume);
	}

	@Override
	public void seOcupaLoc() {
		System.out.println(this.nume + " si-a ocupat locul din loja" + this.nrLoja);
	}

}
