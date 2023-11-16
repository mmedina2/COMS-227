package mini1;

import java.util.Scanner;

/**
 * Utility class with a bunch of static methods for loop practice.
 * @author
 */
public class LoopsInfinityAndBeyond {

	// disable instantiation
	private LoopsInfinityAndBeyond() { }
	
	/**
	 * Returns a new string in which every character in the given string that
	 * is not already repeated consecutively is doubled.
	 * <p> 
	 * For example:
	 * <pre>{@code
	 * "attribute1" -> "aattrriibbuuttee11"
	 * "AAA Bonds" -> "AAA  BBoonnddss"
	 * }</pre>
	 * 
	 * @param text given starting string
	 * @return string with characters doubled
	 */
	public static String doubleChars(String text)
	{
		if (text.equals("")) {
			return text;
		}
		
		String duplicateChars = "";
		char current = text.charAt(0);
		int counter = 1;
		
		if (text.length() == 1) {
			duplicateChars = duplicateChars + current + current;
			return duplicateChars;
		}
		
		for (int i = 1; i < text.length(); i += 1) {
			char compareChar = text.charAt(i);
			duplicateChars = duplicateChars + current;
			
			if (current != compareChar && counter == 1) {
				duplicateChars = duplicateChars + current;
				current = compareChar;
			}
			else if (current == compareChar){
				counter++; 
			}
			if (current != compareChar && counter > 1) {
				counter = 1;
				current = compareChar;
			}
		}
		for (int i = 1; 1 < text.length(); i += 1) {
			char compareChar = text.charAt(i);
			duplicateChars = duplicateChars + current;
			
			if (current != compareChar && counter == 1) {
				duplicateChars = duplicateChars + current;
				current = compareChar;
			}
			else if (current == compareChar){
				counter++;
			}
			
			if (current != compareChar && counter > 1) {
				counter = 1;
				current = compareChar;
			}		
		}
		if (text.charAt(text.length()-1) != text.charAt(text.length()-2)){
			duplicateChars = duplicateChars + text.charAt(text.length()-1) + text.charAt(text.length()-1);
		}
		else {
			duplicateChars = duplicateChars + text.charAt(text.length()-1);
		}
		return duplicateChars;
		
	}

	/**
	 * Returns a year with the highest value, given a string containing pairs
	 * of years and values (doubles). If there are no pairs, the method returns
	 * -1. In the case of a tie, the first year with the highest value is
	 * returned. Assumes the given string follows the correct format.
	 * <p>
	 * For example, given the following string, the year 1995 is returned.
	 * <pre>
	 * 1990 75.6 1991 110.6 1995 143.6 1997 62.3
	 * </pre>
	 * 
	 * @param data given string containing year-value pairs
	 * @return first year associated with the highest value, or -1 if no pair
	 *         given
	 */
	public static int maxYear(String data)
	{
		Scanner scnr = new Scanner(data);
		
		int currentYear;
		double currentValue;
		int bestYear;
		double biggestValue;
		
		if (!scnr.hasNext()) {
			scnr.close();
			return bestYear = -1;
		}
		
		bestYear = scnr.nextInt();
		biggestValue = scnr.nextDouble();
		
		while (scnr.hasNext()) {
			currentYear = scnr.nextInt();
			currentValue = scnr.nextDouble();
			
			if (currentValue > biggestValue) {
				biggestValue = currentValue;
				bestYear = currentYear;
			}
		}
		scnr.close();
		return bestYear;
	}
	
	/**
	 * Returns the number of iterations required until <code>n</code> is equal to 1,
	 * where each iteration updates <code>n</code> in the following way:
	 * 
	 * <pre>
	 *     if n is even
	 *         divide it in half
	 *     else
	 *         multiply n by three and add 1
	 * </pre>
	 * 
	 * For example, given <code>n == 6</code>, the successive values of
	 * <code>n</code> would be 3, 10, 5, 16, 8, 4, 2, 1, so the method returns 8. If
	 * <code>n</code> is less than 1, the method returns -1.
	 * <p>
	 * <em>(Remark:</em> How do we know this won't be an infinite loop for some
	 * values of <code>n</code>? In general, we don't: in fact this is a well-known
	 * open problem in mathematics. However, it has been checked for numbers up to
	 * 10 billion, which covers the range of possible values of the Java
	 * <code>int</code> type.)
	 * 
	 * @param n given starting number
	 * @return number of iterations required to reach <code>n == 1</code>, or -1 if
	 *         <code>n</code> is not positive
	 */
	public static int collatzCounter(int n)
	{
		int numInts = 0;
		if (n<=0) {
			numInts = -1;
		}
		while (n > 1) {
			numInts++;
			if (n % 2 == 0) {
				n = n/2;
			}
			else {
				n = n * 3 + 1;
			}
		}
		return numInts;
			
	}
	
	
	
	/**
	 * Returns a new string in which every word in the given string is doubled. A
	 * word is defined as a contiguous group of non-space (i.e., ' ') characters
	 * that starts with an alphabetic letter and are surrounded by spaces and/or
	 * the start or end of the given string. Assumes the given string does not
	 * contain more than one consecutive white-space.
	 * <p> 
	 * For example:
	 * <pre>{@code
	 * "the time time" -> "the the time time time time"
	 * "The answer is 42." -> "The The answer answer is is 42."
	 * "A. runtime = 10ms" -> "A. A. runtime runtime = 10ms"
	 * }</pre>
	 * 
	 * @param text given starting string
	 * @return new string in which words are doubled
	 */
	public static String doubleWords(String text)
	{
		Scanner scnr = new Scanner(text);
		String doubleWords = "";
		
		while (scnr.hasNext()) {
			String currentWord = scnr.next();
			char firstLetter = currentWord.charAt(0);
			doubleWords = doubleWords + currentWord + "";
			
			if (Character.isAlphabetic(firstLetter)) {
				doubleWords = doubleWords + currentWord + " ";
			}

		}
		scnr.close();
		return doubleWords.strip();
	}

	/**
	 * Returns true if string t can be obtained from string s by removing exactly
	 * one vowel character. The vowels are the letters 'a', 'e', 'i', 'o'
	 * and 'u'. Vowels can be matched in either upper or lower case, for example,
	 * 'A' is treated the same as 'a'. If s contains no vowels the method returns
	 * false.
	 * <p>
	 * For example:
	 * <pre>{@code
	 * "banana" and "banna" returns true
	 * "Apple" and "ppl" returns false
	 * "Apple" and "pple" returns true
	 * }</pre>
	 * 
	 * @param s longer string
	 * @param t shorter string
	 * @return true if removing one vowel character from s produces the string t
	 */
	public static boolean oneVowelRemoved(String s, String t)
	{
		String tempString ="";
		boolean answer = false;
		
		for (int i = 0; i < s.length(); i++) {
			char currentLetter = s.charAt(i);
			if (isVowel(currentLetter)) {
				if (i == 0) {
					tempString += s.substring(1);
				}
				else {
					tempString += s.substring(0, i);
					tempString += s.substring(i + 1);
				}
				if (tempString.equals(t)){
					answer = true;
					return answer;
				}
				else {
					answer = false;
					tempString = "";
				}
			}
		}
		return answer;
	}
	
	private static boolean isVowel(char currentLetter) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Returns a new string in which a UFO pattern in the given string is
	 * shifted one character to the right. The UFO pattern starts with a
	 * {@code '<'}, has one or more {@code '='} and ends with a {@code '>'}. The pattern may wrap
	 * around from the end to the beginning of the string, for example
	 * {@code ">  <="}. Any other characters from the given string remain in place.
	 * If the UFO moves over top of another character, that character is
	 * removed. If there are multiple UFO patterns, only the one that starts
	 * farthest to the left is moved.
	 * <p> 
	 * For example:
	 * <pre>{@code
	 * " <=>  *   . <=> " ->
	 * "  <=> *   . <=> "
	 * 
	 * "   <=>*   .     " ->
	 * "    <=>   .     "
	 * 
	 * ">.   x     .  <=" ->
	 * "=>   x     .   <"
	 * 
	 * " <= <===>   .   " ->
	 * " <=  <===>  .   "
	 * }</pre>
	 * 
	 * @param space given string
	 * @return a new string with a UFO pattern moved one to the right
	 */
	public static String ufo(String space)
	{
		String ufopain = "";
		String newufo = "";
		boolean ny = false;
		int temp1 = space.indexOf("<");
		int temp2 = space.indexOf(">");
		int index1 = 0;
		int ufolength = 0;
		if (temp1 + 1 == temp2) {
			return space;
		}
		if (temp2 > temp1) {
			for (int i = temp1; i <= temp2; i++) {
				if (space.substring(i, i+1).equals("<")) {
					ufopain += space.substring(i, i+1);
					index1 = 1;
					ny = false;
				}
				if (space.substring(i, i+1).equals(">")) {
					ufopain += space.substring(i, i+1);
					ny = false;
				}
				if (space.substring(i, i+1).equals("=")) {
					ufopain += space.substring(i, i+1);
					ny = false;
				}
				if (!(((space.substring(i, i+1).equals("=")) || (space.substring(i, i+1).equals(">") || (space.substring(i, i+1).equals("<")))))) {
					ufopain = "";
					ny = true;
					index1 = 0;
				}
			}
			if(ny == true) {
				return space;
			}
			for (int i = 0; i<ufopain.length(); i++) {
				ufolength += 1;
			}
			for (int i=0; i<index1; i++) {
				newufo += space.substring(i, i+1);
			}
			newufo += "";
			newufo += ufopain;
			for (int i = temp2 + 2; i<space.length(); i++) {
				newufo += space.substring(i, i+1);
			}
		}
		return newufo;
	}
	
	/**
	 * Prints a pattern of <code>2*n</code> rows containing slashes, dashes and backslashes
	 * as illustrated below.
	 * <p>
	 * When {@code n <= 0 }, prints nothing.
	 * <p> 
	 * <code>n = 1</code>
	 * <pre>
	 * \/
	 * /\
	 * </pre>
	 * <p> 
	 * <code>n = 2</code>
	 * <pre>
	 * \--/
	 * -\/
	 * -/\
	 * /--\
	 * </pre>
	 * <p> 
	 * <code>n = 3</code>
	 * <pre>
	 * \----/
	 * -\--/
	 * --\/
	 * --/\
	 * -/--\
	 * /----\
	 * </pre>
	 * 
	 * @param n number of rows in the output
	 */
	public static void printX(int n)
	{
		int numDashes;
		
		if (n<=0) {
			System.out.print("");
		}
		else {
			for (int i = n; i > 0; i--) {
				for (numDashes = i; numDashes < n; numDashes++) {
					System.out.print("-");
				}
				System.out.print("\\");
				for (numDashes = (i - 1) * 2; numDashes > 0; numDashes--) {
					System.out.print("-");
				}
				System.out.print("/");
				System.out.println();
			}
			for (int i = 0; i<n; i++) {
				for (numDashes = i; numDashes < n-1; numDashes++) {
					System.out.print("-");
				}
				System.out.print("/");
				for (numDashes = i*2; numDashes > 0; numDashes--) {
					System.out.print("-");
				}
				System.out.print("\\");
				System.out.println();
			}
		}
	}
}
