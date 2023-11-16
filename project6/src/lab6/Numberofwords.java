package lab6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Numberofwords {	
	  public static void main(String[] args) throws FileNotFoundException
	  {
		  File file = new File("story.txt");    		 
		  Scanner scanner = new Scanner(file);		  
		  while (scanner.hasNextLine())	
		  {	 
			  String line = scanner.nextLine();
			  String[] line1 = line.split("\\s+");
			  System.out.print(line1.length + " ");
			  System.out.println(line);
		  }
		   
		  scanner.close();
	  }
}
