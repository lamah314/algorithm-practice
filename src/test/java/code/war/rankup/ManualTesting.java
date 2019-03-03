package code.war.rankup;

public class ManualTesting {

	public static void main(String[] args) {
		String words = "is2 Thi1s T4est 3a";
		String[] arrayOfWords = words.split(" ");
		String[] RearrangeArray = new String[arrayOfWords.length];
		System.out.println(RearrangeArray.length);
//		if (words.equals("")) {
//			return "";
//		}
//		for (int i = 0; i < arrayOfWords.length; i++) {
//			for (int character = 0; character < arrayOfWords[i].length(); character++) {
//				if (Character.isDigit(arrayOfWords[i].charAt(character))) {
//					RearrangeArray[Character.getNumericValue(arrayOfWords[i].charAt(character))-1] = arrayOfWords[i];
//				}
//			}
//		}
//		return String.join(" ", RearrangeArray);
		System.out.println(ReorderString.order("is2 Thi1s T4est 3a")); 
	}

}
