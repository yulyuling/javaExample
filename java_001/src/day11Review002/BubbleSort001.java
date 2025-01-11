package day11Review002;

public class BubbleSort001 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,2,4,5,1};
		
		int maxIndex = 0;
		for(int i = arr.length-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				
			if( arr[j] < arr[j+1] ) {
				maxIndex = arr[j];
			}
			System.out.println();	
			}
			}
		
	}

}
