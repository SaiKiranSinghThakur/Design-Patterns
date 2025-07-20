package factorymethod;

public class VeganBurgerStore extends BurgerStore {

	@Override
	Burger createBurger(Burgers item) {
		if (item.equals(Burgers.VEGAN)) {
			return new VeganBurger();
		} else if (item.equals(Burgers.DELUXEVEGAN)) {
			return new DeluxeVeganBurger();
		} else {
			return null;
		}
	}

}
