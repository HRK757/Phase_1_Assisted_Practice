package filehandling;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class CreateWriteFile {
	
	
	
	public static void createFileUsingNIO() throws IOException
	{
		
		Path path=Paths.get("c:\\files\\testFileNIO.txt");
		//write data using file class
		String input="Welcome";
		byte array[]=input.getBytes();
		
		Files.write(path, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written Successfully");
		
		
		//if you want to write data of list to  files directly
		Path path1=Paths.get("C:\\files\\testFileNIO.txt");
		//write data  using Files class
		
		List<String> list=Arrays.asList("This  is my first line","This is my secondLine");
		Files.write(path1, list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Lines Written Successfully");
		
	}
	
	
	public static void main(String[] args) {
		try {
			 
			 createFileUsingNIO();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}
}