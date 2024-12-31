package day4;

public class Array004 {

	public static void main(String[] args) {
/*		
		int arr[] = {3, 5, 2, 7, 10};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
			System.out.println(sum);
					*/
		
		//큰 값 찾아내기
		
		int arr[] = {3, 5, 2, 7, 10};
			int max =0; // arr[0]
			for(int i=0; i<arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
				
			}
			System.out.println(max);
		
		}

}
