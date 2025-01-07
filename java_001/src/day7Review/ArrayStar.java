package day7Review;

public class ArrayStar {

	public static void main(String[] args) {

		
		//배열 갯수만큼 별표가 찍히면 좋겠다.
	
		int arr[] = {3, 5, 2, 3, 1};

		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i]; j++) {
				
				System.out.print("*");
			}System.out.println();
			}
		}
		
	
	}
