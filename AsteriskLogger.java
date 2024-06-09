package logger;

import java.util.Arrays;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("***" + data + "***");
		
	}

	@Override
	public void error(String errorData) {
		String astLine = "";
		char ast = '*';
		int textLen = errorData.length();
		char[] repeat = new char[textLen + 6];
		Arrays.fill(repeat, ast);
		astLine += new String(repeat);
		
		System.out.println(astLine);
		System.out.println("***" + errorData + "***");
		System.out.println(astLine);
		
	}

}
