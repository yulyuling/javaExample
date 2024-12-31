package day4;

public class Array003 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		a = 30;
		System.out.println(b); // b=10
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = arr1;
		arr1[0] = 100;
		System.out.println(arr2[0]); //arr2=100 배열에 값을 넣으면 이렇게 됨
		//객체는 주소를 갖고 있음
		// = 는 주소를 주는 것임, 내용을 통째로 주는게 아님
		// 강의실 위치를 알려주는 거지 강의실을 복사해서 만들어주는게 아님.
		// 주소(레퍼런스)를 통해 상자로 접속
		
		
		//보통은 값을 복사해서 넘겨줌
		// int b=a; 라는 건 a의 공간에 b의 이름을 넣는것
		// a=30은 30공간 할당 후 a라는 이름을 줌
		//
		
		
		
	}

}
