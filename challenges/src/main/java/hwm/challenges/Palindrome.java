package hwm.challenges;


public class Palindrome {

	public static int answer(int i) {
		for (int b = 2; b <= i; b++) {
			String string = Integer.toString(i, b);
			int top = string.length() - 1;
			byte[] bytes = string.getBytes();
			boolean found = true;
			for (int j = 0; j <= (top - j); j++) {
				if (bytes[j] != bytes[top - j]) {
					found = false;
					break;
				}
			}
			if (found) {
				return b;
			}
		}
		return 2;
	}
}
