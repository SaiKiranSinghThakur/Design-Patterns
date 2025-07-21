package structural.facade;

public class SmartHomeFacade {

	private SmartHomeSubSystem smartHome;

	public SmartHomeFacade(SmartHomeSubSystem smartHome) {
		this.smartHome = smartHome;
	}

	public void setMovieMode() {
		smartHome.setBrightness(Brightness.DIM);
		smartHome.setTemperature(21);
		smartHome.setIsSecurityArmed(false);
		smartHome.setStreamService(Service.HBO);
	}

	public void setFocusMode() {
		smartHome.setBrightness(Brightness.BRIGHT);
		smartHome.setTemperature(24);
		smartHome.setIsSecurityArmed(true);
		smartHome.setStreamService(Service.NETFLIX);
	}

	public String getCurrentFacadeSetting() {
		return "\n " + "Brightness: " + smartHome.getBrightness() + "\n " + "Temperatue: " + smartHome.getTemperature()
				+ "\n " + "Security Armed: " + smartHome.getBrightness() + "\n " + "Streaming Service: "
				+ smartHome.getStreamingService();

	}

}
