package Burgeri;

public abstract class BurgerDecorator implements Burger {

	protected Burger decoratedBurger;
	
	public BurgerDecorator(Burger decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
	}

	@Override
	public void make() {
		// add something to the basic burger 
		this.decoratedBurger.make();

	}

}
