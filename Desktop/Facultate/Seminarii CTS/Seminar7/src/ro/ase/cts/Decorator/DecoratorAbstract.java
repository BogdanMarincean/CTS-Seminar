package ro.ase.cts.Decorator;

public abstract class DecoratorAbstract implements CardBancar{
	private CardBancar card;
	
	public DecoratorAbstract(CardBancar card)
	{
		this.card = card;
	}
	
	
	
	public CardBancar getCard() {
		return card;
	}



	public abstract void platesteContactless();

	@Override
	public void platestePOS() {
		this.card.platestePOS();	
	}

	@Override
	public void platesteOnline() {
		this.card.platesteOnline();
	}
	
	
}
