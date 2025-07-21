package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Store {

	private List<Customer> customers = new ArrayList<Customer>();
	private int stockQuantity = 0;

	@Override
	public void addCustomer(Customer c) {
		customers.add(c);

	}

	@Override
	public void removeCustomer(Customer c) {
		customers.remove(c);

	}

	@Override
	public void notifyCustomer() {
		for (Customer customer : customers) {
			customer.update(stockQuantity);
		}

	}

	@Override
	public void updateQuantity(int quantity) {
		this.stockQuantity=quantity;
		notifyCustomer();

	}

}
