package exec;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileIODemo {

	public static void main(String[] args) throws IOException {

		Path helloPath = Path.of("hello.txt");

		Path pathTemp = null;		
		if (Files.exists(helloPath) == false)
			pathTemp = Files.createFile(helloPath);

		//Writing to a file
		Files.writeString(helloPath, "Hello World ", StandardOpenOption.TRUNCATE_EXISTING);
		Files.write(helloPath, "Hello Java ".getBytes(), StandardOpenOption.APPEND);
		
		
		// Read
		String content = Files.readString(helloPath);
		 
		System.out.println("Read the contents of " +  helloPath.toFile().getAbsolutePath());
		System.out.println(content);
	}
	


}
