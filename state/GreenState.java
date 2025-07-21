package behavioural.state;

public class GreenState implements TrafficLightState {

	@Override
	public void changeState(TrafficLight trafficLight) {
		System.out.println("Go!");
		trafficLight.setState(new YellowState());
	}

}
