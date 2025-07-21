package structural.decorator;

public class BeverageTest {

	public static void main(String[] args) {
		Beverage beverage1 = new FoamDecorator(new CreamDecorator(new EspressoDecorator(new LightRoast())));

		Beverage beverage2 = new FoamDecorator(new CreamDecorator(new EspressoDecorator(new DarkRoast())));

		System.out.println(beverage1.description());
		System.out.println(beverage1.cost());
		System.out.println(beverage2.description());
		System.out.println(beverage2.cost());
	}

}
