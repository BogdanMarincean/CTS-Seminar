package ro.ase.cts.chain.classes;

public class ContCurent extends Cont{

	public ContCurent(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma)
		{
			System.out.println("Se realizeaza plata in valoare de " + suma + " din contul curent.");
			super.setSold(super.getSold() - suma);
		}
		else if(super.getSuccesorCont() != null)
		{
			super.getSuccesorCont().realizeazaPlata(suma);
		}
		else
		{
			System.out.println("Nu se poate realiza plata");
		}
	}
	
}
