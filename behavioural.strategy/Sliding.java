package behavioural.strategy;

public class Sliding implements Openable {

	@Override
	public void open() {
		System.out.println("Slide to open the door");

	}

	@Override
	public void close() {
		System.out.println("Slide to close the door");

	}

}
