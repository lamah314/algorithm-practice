package code.war.rankup;

public class ReorderString {

	public static String order(String words) {
		String[] arrayOfWords = words.split(" ");
		String[] RearrangeArray = new String[arrayOfWords.length];

		if (words.equals("")) {
			return "";
		}
		for (int i = 0; i < arrayOfWords.length; i++) {
			for (int character = 0; character < arrayOfWords[i].length(); character++) {
				if (Character.isDigit(arrayOfWords[i].charAt(character))) {
					RearrangeArray[Character.getNumericValue(arrayOfWords[i].charAt(character)) - 1] = arrayOfWords[i];
				}
			}
		}
		return String.join(" ", RearrangeArray);
	}

}
