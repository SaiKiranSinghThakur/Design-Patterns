package creational.factorymethod;

public class BurgerDriveThroughTest {

	public static void main(String[] args) {
		BurgerStore cheeseStore = new CheeseBurgerStore();
		BurgerStore veganStore = new VeganBurgerStore();

		Burger burger = cheeseStore.orderBurger(Burgers.CHEESE);
		System.out.println("Ethan ordered a " + burger.getName() + "\n");

		burger = veganStore.orderBurger(Burgers.DELUXEVEGAN);
		System.out.println("Joel ordered a " + burger.getName() + "\n");

	}

}
