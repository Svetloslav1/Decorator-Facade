package Burgeri;

public class BurgerFasade {

	
	private Burger doubleBurger;
	private Burger bltBurger;
	
	
	
	public BurgerFasade() {
		
		this.doubleBurger = new DoubleBurger();
		this.bltBurger = new BLTBurger();
	}

	public void makeDoubleBurger() {
		doubleBurger.make();
	}
	public void makeBLTBurger() {
		bltBurger.make();
	}

}
