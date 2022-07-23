package filehandling;
import java.io.*;
import java.nio.file.*;

public class DeleteFile {
public static void main(String[] args) throws NoSuchFieldException {
		
		
		try {
			Path path= Paths.get("C:\\files\\testFileNIO.txt");
			if(Files.deleteIfExists(path))
				System.out.println("File  deleted");
			else
				System.out.println("File not Deleted");
		} catch (DirectoryNotEmptyException e) {
			// TODO: handle exception
			System.out.println("Directory is not empty");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Invalid Permission");
		}
	}

}
