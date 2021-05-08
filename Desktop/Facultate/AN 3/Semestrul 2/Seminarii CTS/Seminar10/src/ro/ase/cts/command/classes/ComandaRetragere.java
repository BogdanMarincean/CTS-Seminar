package ro.ase.cts.command.classes;

public class ComandaRetragere extends ComandaAbstracta{

	public ComandaRetragere(Executant executant, float suma) {
		super(executant, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getExecutant().retragere(super.getSuma());
	}

}
