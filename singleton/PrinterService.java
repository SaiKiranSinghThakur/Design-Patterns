package singleton;

public class PrinterService {

	private static volatile PrinterService uniqueInstance = null;

	private String mode = null;

	private PrinterService() {
		this.mode = "GrayScale";
	}

	public static PrinterService getInstance() {
		if (uniqueInstance == null) {
			synchronized (PrinterService.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new PrinterService();
				}
			}
		}
		return uniqueInstance;
	}

	public String getPrinterStatus() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		System.out.println("Mode changed to  " + mode);
	}

}
