package simplefactorymethod;

public class VeganBurgerStore extends BurgerStore {

	@Override
	Burger createBurger() {

		return new VeganBurger();
	}

}
