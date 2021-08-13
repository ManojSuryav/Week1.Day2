package Week1.Day2;

public class FindTypes {

	public static void main(String[] args) {
		String str1 = "$$ Welcome to 2nd class of automation $$ ";
		int letter = 0, digit = 0, space = 0, spclChar = 0;

		char[] charArray = str1.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i])) {
				letter++;
			} else if (Character.isDigit(charArray[i])) {
				digit++;
			} else if (Character.isSpaceChar(charArray[i])) {
				space++;
			} else {
				spclChar++;
			}
		}
		System.out.println("Letter is " + letter);
		System.out.println("Digit is " + digit);
		System.out.println("Space is " + space);
		System.out.println("Special Character is " + spclChar);

	}

}
