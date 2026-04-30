package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public int inputNumber() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String numberStr = reader.readLine();
		int number = Integer.parseInt(numberStr);

		return number;
	}

}
