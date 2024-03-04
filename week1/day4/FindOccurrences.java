package week1.day4;

public class FindOccurrences {

	public static void main(String[] args) {

		String input = "TestLeaf";
		int count = 0;

		char[] word = input.toCharArray();
		for (int i = 0; i < word.length; i++) {
			count = 0;
			for (int j = i + 1; j < word.length; j++) {
				if (word[i] == word[j]) {
					count++;
				}

			}
			System.out.println("Occurrences of '" + word[i] + "': " + count);
		}

	}

}
