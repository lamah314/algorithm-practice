package algorithms.easy;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
//
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//I can be placed before V (5) and X (10) to make 4 and 9. 
//X can be placed before L (50) and C (100) to make 40 and 90. 
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
//
//Example 1:
//
//Input: "III"
//Output: 3
//Example 2:
//
//Input: "IV"
//Output: 4
//Example 3:
//
//Input: "IX"
//Output: 9
//Example 4:
//
//Input: "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.
//Example 5:
//
//Input: "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


public class RomanToInteger {
	
	public static void main(String[] args) {
		int test = romanToInt("I");
		System.out.println(test);
		test = romanToInt("V");
		System.out.println(test);
		test = romanToInt("L");
		System.out.println(test);
		test = romanToInt("C");
		System.out.println(test);
		test = romanToInt("VI");
		System.out.println(test);
		test = romanToInt("IV");
		System.out.println(test);
	}
	
	public static int romanToInt(String s) {
        int integerAnswer = 0;
        int previousChar;
        int currentChar = oneRomanToInt(s.charAt(0));
        for (int i=1; i<s.length(); i++) {
        	previousChar = currentChar;
        	currentChar = oneRomanToInt(s.charAt(i));
        	if(previousChar < currentChar) {
        		 integerAnswer -= previousChar;
        	} else {
        		integerAnswer += previousChar;
        	}
        }
        
        integerAnswer += currentChar;
        return integerAnswer;
    }
	
	public static int oneRomanToInt(char romanCharacter) {
		if(romanCharacter == 'I') {
			return 1;
		} else if(romanCharacter == 'V') {
			return 5;
		} else if(romanCharacter == 'X') {
			return 10;
		} else if(romanCharacter == 'L') {
			return 50;
		} else if(romanCharacter == 'C') {
			return 100;
		} else if(romanCharacter == 'D') {
			return 500;
		} else if(romanCharacter == 'M') {
			return 1000;
		} else {
			return 0;
		}
				
	}
}
