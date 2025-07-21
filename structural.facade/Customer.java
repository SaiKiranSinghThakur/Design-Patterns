package structural.facade;

public class Customer {
	public static void main(String[] args) {

		SmartHomeFacade smartHome = new SmartHomeFacade(new SmartHomeSubSystem());
		smartHome.setFocusMode();
		smartHome.setMovieMode();

		System.out.println("CURRENT SETTINGS: " + smartHome.getCurrentFacadeSetting());
	}

}
