package Week1.Day2;

public class PalindromeUsingString {

	public static void main(String[] args) {
		String str = "mwdam", reverseStr = "";//Declare A String value as"madam"//Iterate over the String in reverse order
	                                                 
		int strlength = str.length();
		for (int i = (strlength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);// Add the char into rev
		}
//Compare the original String with the reversed String, if it is same then print palinDrome 
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + "- the given string is a palindrome");
		} else {
			System.out.println(str + "- the given string is not a palindrome");

		
		}	

	}

}
