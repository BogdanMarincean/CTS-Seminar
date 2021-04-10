package ro.ase.cts.Decorator.Main;

import ro.ase.cts.Decorator.Card;
import ro.ase.cts.Decorator.DecoratorContactlessCard;
import ro.ase.cts.Decorator.DecoratorContactlessTelefon;

public class Main {

	public static void main(String[] args) {
		Card card = new Card("Bogdan");
		card.platesteOnline();
		card.platestePOS();
		System.out.println("----------------------------------------");
		DecoratorContactlessCard decoratorContactless = new DecoratorContactlessCard(card);
		decoratorContactless.platesteOnline();
		decoratorContactless.platestePOS();
		decoratorContactless.platesteContactless();
		System.out.println("--------------------------------------");
		DecoratorContactlessTelefon decoratorTelefon = new DecoratorContactlessTelefon(card);
		decoratorTelefon.platestePOS();
		decoratorTelefon.platesteContactless();
	}

}
