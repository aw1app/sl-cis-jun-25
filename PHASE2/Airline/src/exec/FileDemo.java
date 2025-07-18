package exec;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		Path helloPath = Path.of("hello.txt");

		Path pathTemp = null;		
		if (Files.exists(helloPath) == false)
			pathTemp = Files.createFile(helloPath);

		boolean fileExist = Files.exists(helloPath);

		// Print full path of the file represented by helloPath Path.
		System.out.println(helloPath.toFile().getAbsolutePath() + " exists = " + fileExist);

	}
	


}
