package behavioural.strategy;

public class NonLocking implements Lockable {

	@Override
	public void lock() {
		System.out.println("non locking door");

	}

	@Override
	public void unlock() {
		System.out.println("non locking door");
	}

}
