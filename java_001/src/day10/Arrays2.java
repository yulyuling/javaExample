package day10;

public class Arrays2 {

//	public static void main(String[] args) {
		
	static int minValue(int[] arr) {
		
		
		int min = 0;
		for(int i=1; i<arr.length; i++) {
				if(arr[i] < arr[min]) {
					min = i;
				}
			}
		return arr[min];
	}
		static int maxValue(int[] arr) {
		
			int max = 0;
		for(int j=0; j<arr.length; j++) {
			if(arr[j] > arr[max]) {
				max = j;
			}
		}
			int temp = arr[min];
			arr[min] = arr[max];
			arr[max] = temp;
		}
}
