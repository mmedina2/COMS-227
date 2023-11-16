package lab7;

import java.io.File;
import java.util.Scanner;

public class CP2 {
	
	public static int countFiles(File f) {
		
		int count = 0;
		if (!f.isDirectory()) {
			count = 1;
		}
		
		else {
			File[] files = f.listFiles();
			for (int i = 0; i < files.length; ++i) {
				count += countFiles(files[i]);
			}
		}
		return count;
	}
	
	
	public static int countPatterns(int n)
	{
		if (n < 0) {
			return 0;
		}
		else if (n == 0) {
			return 1;
		}
		return countPatterns(n-1) + countPatterns(n-3);
	}
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Marco\\OneDrive - Iowa State University\\Spring 2022\\COM S 227\\project6");
		System.out.println(countFiles(file));

		System.out.println(countPatterns(5));
	}
	

}
