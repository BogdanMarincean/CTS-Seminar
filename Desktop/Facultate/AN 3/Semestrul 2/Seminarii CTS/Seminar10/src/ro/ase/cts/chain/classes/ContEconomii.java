package ro.ase.cts.chain.classes;

public class ContEconomii extends Cont{

	public ContEconomii(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma)
		{
			System.out.println("Se realizeaza plata in valoare de " + suma + " din contul de economii.");
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
