package logger;

public class App {

	public static void main(String[] args) {
		Logger log1 = new AsteriskLogger();
		Logger log2 = new SpacedLogger();
		
		log1.log("Hello");
		log1.error("UhOh");
		
		log2.log("Hello");
		log2.error("UhOh");

	}

}
