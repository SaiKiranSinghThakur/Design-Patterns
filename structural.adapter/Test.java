package structural.adapter;

public class Test {

	public static void main(String[] args) {
		JsonLogger logger = new LoggerAdapter(new XmlLogger());
		logger.logMessage("<message>hello</message>");
	}

}
