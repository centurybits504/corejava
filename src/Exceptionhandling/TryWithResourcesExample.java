package Exceptionhandling;

/*try with resources example*/
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesExample {

	public static void main(String[] args) throws IOException {

		try (FileInputStream fis = new FileInputStream(
				"TryWithResourcesExample.txt")) {
			int fileData = fis.read();
			while (fileData != -1) {
				System.out.print((char) fileData);
				fileData = fis.read();
			}
		}
	}

}
