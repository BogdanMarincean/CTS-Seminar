package ro.ase.cts.Strategy.Classes;

public class PlataBonuriMasa implements Payable{

	@Override
	public void pay(float suma) {
		System.out.println("A fost realizata o suma cu bonuri de masa in valoare de " + suma + " lei.");
	}

}
