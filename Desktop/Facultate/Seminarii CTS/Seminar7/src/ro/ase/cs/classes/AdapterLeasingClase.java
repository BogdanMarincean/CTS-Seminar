package ro.ase.cs.classes;

public class AdapterLeasingClase extends Leasing implements Creditable{
	
	public AdapterLeasingClase(String numeClient, int suma)
	{
		super(numeClient, suma);
	}

	@Override
	public void crediteaza() {
		this.oferaLeasing();
		
	}
	
}
