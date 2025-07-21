package behavioural.observer;

public class NotifierTest {

	public static void main(String[] args) {
		Store store = new BookStore();

		Customer customer1 = new BookCustomer(store);
		Customer customer2 = new BookCustomer(store);

		System.out.println("Setting stock to 0.");
		store.updateQuantity(0);

		System.out.println("\nSetting stock to 10");
		store.updateQuantity(10);

		store.removeCustomer(customer1);
		
		System.out.println("\nSetting stock to 2.");
		store.updateQuantity(2);
	}

}
