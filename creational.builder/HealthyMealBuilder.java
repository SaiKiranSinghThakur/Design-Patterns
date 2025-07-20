package creational.builder;

public class HealthyMealBuilder implements Builder {
	
	private Meal meal;
	
	public HealthyMealBuilder() {
		this.meal=  new Meal();
	}

	@Override
	public void addStarter() {
		meal.setStarter(Starter.SALAD);

	}

	@Override
	public void addMainCourse() {
		meal.setMain(Main.GRILLED_CHICKEN);

	}

	@Override
	public void addDessert() {
		meal.setDessert(Dessert.FRUIT_SALAD);

	}

	@Override
	public void addDrink() {
		meal.setDrink(Drink.WATER);

	}

	Meal build() {
		return this.meal;
	}
}
