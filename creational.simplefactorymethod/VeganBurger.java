package simplefactorymethod;

public class VeganBurger implements Burger {

	@Override
	public void prepare() {
		System.out.println("Preparing Vegan Burger...");
	}

	@Override
	public String getName() {
		return "Vegan Burger";
	}

}
