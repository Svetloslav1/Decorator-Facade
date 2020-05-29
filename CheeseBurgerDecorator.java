package Burgeri;

public class CheeseBurgerDecorator extends BurgerDecorator {

	public CheeseBurgerDecorator(Burger decoratedBurger) {
		super(decoratedBurger);
		
	}
	
	public void make() {
		decoratedBurger.make();
		addCheese(decoratedBurger);
	}
	private void addCheese(Burger decoratedBurger) {
		//...
		
		System.out.println("Added Egg to the Burger");
	}
	
}

