package simplefactorymethod;

abstract class BurgerStore {
	// Factory Method
	abstract Burger createBurger();

	public Burger orderBurger() {
		Burger burger = createBurger();
		burger.prepare();
		System.out.println("Serving: " + burger.getName());
		return burger;
	}

}
