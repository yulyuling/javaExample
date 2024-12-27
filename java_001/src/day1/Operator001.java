package day1;

public class Operator001 {

	public static void main(String[] args) {

//		int a = 1;
//		a = a+1; //a에 값을 저장하는 것
//		a++;
//		a--; // a = a-1;
//		
//		System.out.println(a);
//		// 출력 값 2
		// a에다가 1을 더해라
//		
//		int x = 1;
//		int y = ++x;
//		System.out.println(y);
//		System.out.println(x);
//		
//		int x = 10;
//		++x;
//		// x = 11
//		
//		int y = x++;
//		// x = 12 // x++면 x를 y에 먼저 담는다 y = 11
//		
//		int z = --y;
//		// --y니까 y = 10
//		
//		System.out.println(x);
//		// x=12
//		
//		System.out.println(y);
//		// y = 10
//		
//		System.out.println(z);
//		// z = 10 z위의 코드를 보면 y=11이니까 --y해서 10이 됨.
//		
//		
//		int a = 10;
//		a = a + 1; // a++
//		a++; // ++a; a = a + 1
//		// a = 12
//		
//		int b = a++; //변수에 값을 담을 때 문제가 생김
//		//위에 a++가 있어서 b = 12
//		// 거기다가 ++를 먹여서 a = 13
//		
//		b = --a;
//		// a = 12 --부터하니깐
//		// b = 12
//		
		
		int x = 5;
		int y = ++x; // x = 6 , y = 5
		y = x--; // y = 6 , x = 5
		int z = x+y; // y=6 + x=5 = 11 , z = 11
		++x; // x = 6 (함정) x는 z값에 정해짐.
		x = z++; // x = 11 , z = 12 (z에 있는 ++값이 증가되기 전에 담아라)
		//z는 앞이 어찌됐든 1 증가해라 z= 12
		System.out.println(x); // x = 12 , x = 11
		System.out.println(y); // y = 6
		System.out.println(z); // z = 11 , z = 12
		
		
	}

}
