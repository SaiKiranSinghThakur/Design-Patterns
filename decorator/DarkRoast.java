package structural.decorator;

public class DarkRoast extends Beverage {

	@Override
	double cost() {
		return 3.45;
	}

	@Override
	String description() {
		return "Dark Roast";
	}

}
