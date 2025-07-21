package behavioural.state;

public class RedState implements TrafficLightState {

	@Override
	public void changeState(TrafficLight trafficLight) {
		System.out.println("Stop!");
		trafficLight.setState(new YellowState());
	}

}
