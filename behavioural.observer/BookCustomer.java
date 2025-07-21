package behavioural.observer;

public class BookCustomer implements Customer {

	private int observedStockQuantity;
	private Store store;

	public BookCustomer(Store store) {
		this.store = store;
		store.addCustomer(this);
	}

	@Override
	public void update(int stockQuantity) {
		this.observedStockQuantity = stockQuantity;
		if (stockQuantity > 0) {
			System.out.println("Hello, book is in stock now !!!");
		}

	}

}
