package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "Kavya";
		String name2 = " ";

		System.out.println("Before printing unique character : " + name);

		char[] nameChar = name.toCharArray();

		Set<Character> setChar = new LinkedHashSet<Character>();

		for (Character c : nameChar) {
			setChar.add(c);
		}

		for (Character c1 : setChar) {
			name2 = name2 + c1;
        }
		System.out.println("Unique Characters : "+ name2);
	}

}
