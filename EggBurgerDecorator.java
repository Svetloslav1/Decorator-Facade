package Burgeri;

public class EggBurgerDecorator extends BurgerDecorator {

	public EggBurgerDecorator(Burger decoratedBurger) {
		super(decoratedBurger);
		
	}
	
	public void make() {
		decoratedBurger.make();
		addEgg(decoratedBurger);
	}
	private void addEgg(Burger decoratedBurger) {
		//...
		
		System.out.println("Added Egg to the Burger");
	}
	
}

