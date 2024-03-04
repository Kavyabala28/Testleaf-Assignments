package week1.day4;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		int count;
		String update = "";

		String[] msg = text.split(" ");
		for (int i = 0; i < msg.length; i++) {
			count = 0;
			for (int j = 0; j < msg.length; j++) {
				if (msg[i].equals(msg[j])) {
					count++;
					if (count > 1) {
						update = text.replace(msg[i], " ");
					}
				}
			}
		}
		System.out.println(update);
	}

}
