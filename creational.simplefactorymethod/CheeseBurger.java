package creational.simplefactorymethod;

public class CheeseBurger implements Burger {

	@Override
	public void prepare() {
		System.out.println("Preparing Cheese Burger...");

	}

	@Override
	public String getName() {

		return "Cheese Burger";
	}

}
