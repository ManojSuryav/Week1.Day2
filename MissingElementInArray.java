package Week1.Day2;

public class MissingElementInArray {

	public static void main(String[] args) {
	int[] arr = {0,1,2,3,4,6,7,8};
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=i) {
				System.out.println("Missing element:"+i);
			break;
			}
		}
}}