package logger;

public class SpacedLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println(data.replace("", " ").trim());
		
	}

	@Override
	public void error(String errorData) {
		System.out.println("ERROR: " + errorData.replace("", " ").trim());
	}

}
