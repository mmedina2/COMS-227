package lab2;

public class StringTest {
	public static void main(String[] args) {
		String message;
		message = "Hello, world!";
		System.out.println(message);
		int theLength = message.length();
		System.out.println(theLength);
		
		char theChar = message.charAt(0);
		System.out.println(theChar);

		theChar = message.charAt(1);
		System.out.println(theChar);
		
		String Upper = message.toUpperCase();
		System.out.println(Upper);
		System.out.println(Upper.substring(3));
		
	
		}
}
