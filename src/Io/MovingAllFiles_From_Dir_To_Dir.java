package Streams;

 
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
 
import java.nio.file.Path;
import java.nio.file.Paths;
 

import static java.nio.file.StandardCopyOption.*;
public class MovingAllFiles_From_Dir_To_Dir {

	public static void main(String[] args) {
		 
		Path sourceDir = Paths.get("D:\\n1");
	    Path destinationDir = Paths.get("E:\\n2");

	    try //try with resources
	    (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDir)) 
	    {
	     
	        for (Path path : directoryStream) {
	            System.out.println("copying " + path.toString());
	            Path d2 = destinationDir.resolve(path.getFileName());
	            System.out.println("destination File=" + d2);
	            Files.move(path, d2, REPLACE_EXISTING);
	        }
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}

}
