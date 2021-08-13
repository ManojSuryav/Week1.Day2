package Week1.Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str = "chan geme";
		char[] charArray = str.toCharArray();//Convert the String to character array
		//Traverse through each character (using loop)
		for (int i = 0; i <charArray.length; i++) {
			if (i % 2 == 0) {
//within the loop, change the character to uppercase, if the index is odd else don't change
				System.out.print(Character.toUpperCase(charArray[i]));

			} else {
				System.out.print(charArray[i]);
			}
		}

	}

	}


