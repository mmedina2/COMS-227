package lab5;

public class Checkpoint1 {
	
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