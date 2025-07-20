package creational.builder;

public class client {

	public static void main(String[] args) {
		Director director1 = new Director();
		VeganMealBuilder builder1 = new VeganMealBuilder();
		director1.constructVeganMeal(builder1);

		Meal veganMeal = builder1.build();

		System.out.println("Vegan Meal Constructed: ");
		System.out.println("Starter: " + veganMeal.getStarter());
		System.out.println("Main: " + veganMeal.getMain());
		System.out.println("Dessert " + veganMeal.getDessert());
		System.out.println("Drink " + veganMeal.getDrink());

		Director director2 = new Director();
		HealthyMealBuilder builder2 = new HealthyMealBuilder();
		director2.constructHealthyMeal(builder2);
		Meal healthyMeal = builder2.build();
		
		System.out.println("---------------");
		
		System.out.println("Healthy Meal Constructed: " + healthyMeal.getStarter());
		System.out.println("Strater " + healthyMeal.getMain());
		System.out.println("Main: " + healthyMeal.getDessert());
		System.out.println("Drink " + healthyMeal.getDrink());

	}

}
