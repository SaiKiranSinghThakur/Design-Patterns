package structural.facade;

public class SmartHomeSubSystem {

	private Brightness brightness;
	private int temperature;
	private boolean isSecurityArmed;
	private Service streamingService;

	public SmartHomeSubSystem() {
		this.brightness = brightness.UNKNOWN;
		this.temperature = 19;
		this.isSecurityArmed = false;
		this.streamingService = Service.UNKNOWN;
	}

	public void setBrightness(Brightness brightness) {
		this.brightness = brightness;
	}

	public Brightness getBrightness() {
		return brightness;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setIsSecurityArmed(boolean isSecurityArmed) {
		this.isSecurityArmed = isSecurityArmed;
	}

	public boolean getIsSecurityArmed() {
		return isSecurityArmed;
	}

	public void setStreamService(Service streamingService) {
		this.streamingService = streamingService;
	}

	public Service getStreamingService() {
		return streamingService;
	}

	private void enableMotionSensors() {
	}

	private void updateFirmware() {
	}
}
