package week1.day4;

public class OddIndexToUppercase {

	public static void main(String[] args) {

		String test = "changeme";
		char[] test2 = test.toCharArray();

		for (int i = 0; i < test2.length; i++) {
			if (i % 2 != 0) {
				test2[i] = Character.toUpperCase(test2[i]);
			}
			System.out.print(test2[i]);

		}

	}

}
