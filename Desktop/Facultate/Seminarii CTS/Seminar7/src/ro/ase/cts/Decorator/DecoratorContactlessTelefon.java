package ro.ase.cts.Decorator;

public class DecoratorContactlessTelefon extends DecoratorAbstract{

	public DecoratorContactlessTelefon(CardBancar card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		System.out.println(((Card)super.getCard()).getTitular() + " a realizat o plata contactless cu telefonul!");	
	}
	
}
