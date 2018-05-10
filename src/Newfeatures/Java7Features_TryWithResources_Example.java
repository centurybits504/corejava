package Newfeatures;

/*java 7 feature : Try with resource*/
import java.io.FileInputStream;
import java.io.IOException;

public class Java7Features_TryWithResources_Example {

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
