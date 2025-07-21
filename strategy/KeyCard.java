package behavioural.strategy;

public class KeyCard implements Lockable {

	@Override
	public void lock() {
		System.out.println("Door locked using keyCard");

	}

	@Override
	public void unlock() {
		System.out.println("Door unlocked using keyCard");

	}

}
