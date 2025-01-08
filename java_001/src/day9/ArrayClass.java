package day9;

public class ArrayClass {
	//배열에서 가장 큰 값을 찾아라.
	
	static int maxValue(int [] array) {
		
		int max = array[0];
		
		for(int value : array) {
			if(max < value) {
				max = value;
				
			}
		}
		
		return max;
	}
	//배열에서 가장 큰 값의 위치를 찾는(리턴) 메소드 작성
	
	static int maxIndex(int[] array) {
		
		int max2 = array[0];
		int value = 0;
		int temp = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<i; j++) {
				if(array[max2] < array[i]) {
					temp = value;
				
			}
				
				return temp;
			}
			
		}
	}
}


