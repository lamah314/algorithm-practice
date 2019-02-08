package algorithms.easy;

public class ManualTesting {

	public static void main(String[] args) {
		int x = 121;
		int reverse = 0;

		while (x != 0) {
			int unit = x % 10;
			x /= 10;
			reverse = reverse * 10 + unit;
		}
		System.out.println(reverse);
		System.out.println(reverse == x);
		System.out.println(Integer.compare(x, reverse) == 1);

	}

}
