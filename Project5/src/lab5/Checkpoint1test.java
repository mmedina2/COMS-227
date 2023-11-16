package lab5;
public class Checkpoint1test {
	  public static void main(String[] args) {

	        // Testing the Initial Fetch Method with two test data
	        String nameForTestingOne = "Cher";
	        String initialsFromNameOne = getInitialsFromName(nameForTestingOne);
	        System.out.println("Original name : " + nameForTestingOne + ", Initials = " + initialsFromNameOne);

	        System.out.println();

	        String nameForTestingTwo = "Edna del Humboldt von der Schooch";
	        String initialsFromNameTwo = getInitialsFromName(nameForTestingTwo);
	        System.out.println("Original name : " + nameForTestingTwo + ", Initials = " + initialsFromNameTwo);

	        System.out.println();

	        // Testing the first vowel index find method with two data set
	        String vowelsAtFirst1 = "paeios";
	        int index1 = findFirstVowellIndex(vowelsAtFirst1);
	        System.out.println("String to search : " + vowelsAtFirst1);
	        System.out.println("Index = " + index1);

	        System.out.println();

	        String vowelsAtFirst2 = "aeios";
	        int index2 = findFirstVowellIndex(vowelsAtFirst2);
	        System.out.println("String to search : " + vowelsAtFirst2);
	        System.out.println("Index = " + index2);
	}
	  
	  
		public static String getInitialsFromName(final String name) {
			if(name == null || name.isEmpty()) {
				return "";
			}
			String[] wordsInNameObj = name.split(" ");
			String initials = "";
			
			for (String wordsInName : wordsInNameObj) {
				String initialChar = wordsInName.trim().charAt(0)+"";
				initials += initialChar;
			}
			
			return initials; 
		}

		public static int findFirstVowellIndex(final String stringToSearch) {
			if(stringToSearch == null || stringToSearch.isEmpty()) {
				return -1;
			}
			int length = stringToSearch.length();
			int index = -1;
			for (int i = 0; i < length; i++) {
				char ch = stringToSearch.charAt(i);
				if ("aeiouAEIOU".indexOf(ch) >= 0) {
					index = i;
					break;
				}
			}
			return index; 
		}
}


