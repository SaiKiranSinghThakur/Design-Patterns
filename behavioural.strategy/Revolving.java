package behavioural.strategy;

public class Revolving implements Openable {

	@Override
	public void open() {
		System.out.println("walk around to open");

	}

	@Override
	public void close() {
		System.out.println("walk around to close");

	}

}
