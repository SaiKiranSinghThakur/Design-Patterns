package behavioural.strategy;

public class Password implements Lockable {

	@Override
	public void lock() {
		System.out.println("Door locked using password!");

	}

	@Override
	public void unlock() {
		System.out.println("Door unlocked using password!");

	}

}
