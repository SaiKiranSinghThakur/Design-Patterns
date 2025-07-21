package structural.decorator;

public class FoamDecorator extends BeverageDecorator {

	public FoamDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	double cost() {
		return 0.2 + beverage.cost();
	}

	@Override
	String description() {
		return beverage.description() + ", Foam";
	}

}
