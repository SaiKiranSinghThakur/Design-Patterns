package structural.decorator;

public class CreamDecorator extends BeverageDecorator {

	public CreamDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	double cost() {
		return 0.3 + beverage.cost();
	}

	@Override
	String description() {
		return beverage.description() + ", Cream";
	}

}
