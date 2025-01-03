package day6;

public class Array001 {

	public static void main(String[] args) {
		
		int arr[] = {3,5,2,1,4};
		int sum = 0;
		for(int num : arr) {
			sum += num;
			System.out.println(sum);
		}
		/*
		 * for(int i=0; i<arr.length; i++){
			sum += arr[i];
		*/
	}

}
