package structural.decorator;

public class LightRoast extends Beverage {

	@Override
	double cost() {
		return 3.00;
	}

	@Override
	String description() {
		return "Light Roast";
	}

}
