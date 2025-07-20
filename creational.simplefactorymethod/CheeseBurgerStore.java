package simplefactorymethod;

public class CheeseBurgerStore extends BurgerStore {

	@Override
	Burger createBurger() {

		return new CheeseBurger();
	}

}
