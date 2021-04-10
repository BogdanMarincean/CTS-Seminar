package ro.ase.cts.Decorator;

public class DecoratorContactlessCard extends DecoratorAbstract{

	public DecoratorContactlessCard(CardBancar card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		System.out.println(((Card)super.getCard()).getTitular() + " a realizat o plata contactless cu cardul!");
	}
	
}
