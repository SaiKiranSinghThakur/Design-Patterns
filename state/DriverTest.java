package behavioural.state;

public class DriverTest {
	public static void main(String[] args) {
		TrafficLight currentLight = new TrafficLight();

		currentLight.change(); //stop
		currentLight.change(); // wait
		currentLight.change(); //Go
		currentLight.change(); // wait

		currentLight.change(); // stop
		currentLight.change(); // wait
		currentLight.change(); // go

	}

}
