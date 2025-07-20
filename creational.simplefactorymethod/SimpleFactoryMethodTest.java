package creational.simplefactorymethod;

public class SimpleFactoryMethodTest {

	public static void main(String[] args) {
		BurgerStore cheeseStore = new CheeseBurgerStore();
		BurgerStore veganStore = new VeganBurgerStore();

		Burger burger1 = cheeseStore.orderBurger();
		Burger burger2 = veganStore.orderBurger();

	}

}
