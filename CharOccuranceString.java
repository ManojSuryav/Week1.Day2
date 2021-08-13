package Week1.Day2;

public class CharOccuranceString {

	public static void main(String[] args) {
		String str1 = "Welcome to Chennai";
		/*
		 *  declare and initialize a variable count to store the number of occurrences convert the string into char array
		 */

		int count = 0;
		char charOcc = 'n';
		char[] charArr = str1.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == charOcc) {
				count++;

			}

		}
		System.out.println("No. of times 'n' occured in a string is " + count);

	}

}
