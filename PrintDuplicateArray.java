package Week1.Day2;

public class PrintDuplicateArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		for(int i=0;i<=arr.length-1;i++){// get the length of the array
		for(int j=0;j<=arr.length-1;j++) {// declare an int variable named count
			if(arr[i]==arr[j])
				System.out.println("Duplicate Arra-"+arr[j]);
		}
		}

	}

}
