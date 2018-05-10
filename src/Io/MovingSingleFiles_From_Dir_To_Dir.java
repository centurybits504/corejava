package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
 //http://java.about.com/od/InputOutput/a/Deleting-Copying-And-Moving-Files.htm
public class MovingSingleFiles_From_Dir_To_Dir {

	public static void main(String[] args) {
		Path original = Paths.get("E:/n2/sai1.jpg");
		Path destination = Paths.get("D:/n1/sai1.jpg");
		try { Files.move(original, destination, StandardCopyOption.REPLACE_EXISTING); } 
		catch (IOException x) { x.printStackTrace(); }

	}

}
