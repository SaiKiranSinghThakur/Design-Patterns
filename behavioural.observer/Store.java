package behavioural.observer;

public interface Store {

	void addCustomer(Customer c);

	void removeCustomer(Customer c);

	void notifyCustomer();

	void updateQuantity(int quantity);

}
