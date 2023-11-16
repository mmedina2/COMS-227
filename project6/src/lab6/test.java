package lab6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class test {
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("C:\\Users\\Marco\\OneDrive - Iowa State University\\Spring 2022\\COM S 227\\project3\\src\\lab3\\Basketball.java");
	    Scanner scanner = new Scanner(file);
	    int lineCount = 1;

	    while (scanner.hasNextLine())
	    {
	      String line = scanner.nextLine();
	      System.out.print(lineCount + " ");
	      System.out.println(line);
	      lineCount += 1;
	    }
	    
	    System.out.println(file.exists());          // true if the file exists
	    System.out.println(file.getName());         // name of the file 
	    System.out.println(file.getAbsolutePath()); // absolute path to the file
	    System.out.println(file.length());          // size of the file
	    scanner.close();
	}
}
