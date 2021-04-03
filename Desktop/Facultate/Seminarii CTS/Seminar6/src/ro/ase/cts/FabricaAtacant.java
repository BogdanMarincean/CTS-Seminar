package ro.ase.cts;

public class FabricaAtacant implements FabricaJucatori{

	@Override
	public Jucator creazaJucator(String nume, int nrTricou) {
		// TODO Auto-generated method stub
		return new Atacant(nume, nrTricou);
	}

}
