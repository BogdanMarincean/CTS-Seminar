package ro.ase.cts;

public class FabricaFundas implements FabricaJucatori{

	@Override
	public Jucator creazaJucator(String nume, int nrTricou) {
		// TODO Auto-generated method stub
		return new Fundas(nume, nrTricou);
	}

}
