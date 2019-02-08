package algorithms.easy;

//Given a 32-bit signed integer, reverse digits of an integer.

//Example 1:
//Input: 123
//Output: 321

//Example 2:
//Input: -123
//Output: -321

public class ReverseInteger {
	public int reverse(int x) {
		if (x > 2147483647) { //does not accurately account for overflow
			return 0;
		} else {
        int answer = x%10;
		while (Math.abs(x) > 10) { 
			x /= 10;
			answer *= 10;
			answer = answer + x%10;	
		}
		return answer;
		}
    }
}
