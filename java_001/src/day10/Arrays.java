package day10;

public class Arrays {

	public static String main(String[] args) {

			//1번째 방식
		static int minValue(int[] arr) {
				int minIndex = 0;
				for(int i=1; i<arr.length; i++) {
					if(arr[i] < arr[minIndex]) {
						minIndex = i;
					}
				}
				return arr[minIndex];
		}
	//2 배열에서 가장 큰 값을 찾아서 리턴
	// 배열은 주소를 공유하기 때문에 리턴할 필요가 없다.
	
		static int maxValue(int[] arr) {
			int min = 0;
			int max = 0;
			for(int i=1; i<arr.length; i++) {
				max = arr[i] > arr[max] ? i : max;
				min = arr[i] < arr[min] ? i : min;
			}
			int temp = arr[max];
			arr[max] = arr[min];
			arr[min] = temp;
		}
		
	}

		
		//1 배열에서 가장 작은 값을 찾아서 리턴
		//2 배열에서 가장 큰 값을 찾아서 리턴
		
	
	   // 내가 한 거
//		int arr[] = {1,5,4,3,2};
//		
//		
//		int min = 0;
//		for(int i=1; i<arr.length; i++) {
//				if(arr[i] < arr[min]) {
//					min = i;
//				}
//			}
//		return min;
//	}
//
//			int max = 0;
//		for(int j=0; j<arr.length; j++) {
//			if(arr[j] > arr[max]) {
//				max = j;
//			}
//		}
//			int temp = arr[min];
//			arr[min] = arr[max];
//			arr[max] = temp;
//		}
//}




