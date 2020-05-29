package Burgeri;

public class BurgerMain {

	public static void main(String[] args) {

		Burger classicBurger = new ClassicBurger();
		classicBurger.make();
		
		System.out.println("--------------------------------");
		
		Burger eggBurger = new ClassicBurger();
		Burger witheggBurger = new EggBurgerDecorator(eggBurger); 
		witheggBurger.make();
		
		System.out.println("--------------------------------");
		
		Burger cheeseBurger = new ClassicBurger();
		Burger withCheeseBurger = new EggBurgerDecorator(cheeseBurger); 
		withCheeseBurger.make();
		
		System.out.println("--------------------------------");
		
		BurgerFasade burgerFasade = new BurgerFasade();
		
		burgerFasade.makeBLTBurger();
		
		System.out.println("--------------------------------");
		
		burgerFasade.makeDoubleBurger();
		
		
		
	}

}
