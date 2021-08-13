package Week1.Day2;

public class ReverseEvenWord {

	public static void main(String[] args) {
		String str = "I am a software tester";
		String[] splitstr = str.split(" ");
		for(int i=0 ; i<splitstr.length ; i++) {
			if(i%2 !=0) {
				char chararray[] = splitstr[i].toCharArray();
				for(int j = chararray.length-1 ; j >= 0 ;j--) {
				System.out.print(chararray[j]);
				}
				System.out.print(" ");
			}
			else { 
				System.out.print(splitstr[i]);
				System.out.print(" ");
			}
		}

	}

}
