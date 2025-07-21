package behavioural.state;

public class YellowState implements TrafficLightState {

	@Override
	public void changeState(TrafficLight trafficLight) {
		if (trafficLight.getPrevState() instanceof RedState) {
			System.out.println("waiting !!!");
			trafficLight.setState(new GreenState());
		} else {
			System.out.println("waiting!!");
			trafficLight.setState(new RedState());
		}

	}

}
