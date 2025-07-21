package behavioural.strategy;

public class Standard implements Openable {

	@Override
	public void open() {
		System.out.println("Pushing the door to open");

	}

	@Override
	public void close() {
		System.out.println("Pulling the door to close");

	}

}
