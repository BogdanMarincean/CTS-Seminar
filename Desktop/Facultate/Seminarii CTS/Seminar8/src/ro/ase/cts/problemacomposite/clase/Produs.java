package ro.ase.cts.problemacomposite.clase;

public class Produs implements ComponentaAbstracta{
	private String numeProdus;
	
	

	public Produs(String numeProdus) {
		super();
		this.numeProdus = numeProdus;
	}

	@Override
	public void printareElement() {
		System.out.println("Produsul " + this.numeProdus);
		
	}

	@Override
	public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void stergeNod(ComponentaAbstracta componentaAbstracta) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ComponentaAbstracta getNod(int pozitie) {
		return null;
	}
}
