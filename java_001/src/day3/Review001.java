package day3;

import java.util.Scanner;

public class Review001 {

	public static void main(String[] args) {
		// Ctrl + Shift + O
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scan.next(); //next 문자열로 받아들이는
		System.out.println("나이 : ");
		int age = scan.nextInt();
		
		int num1 = 10;
		int num2 = 20;
		System.out.println(age == num1);
		
		//and, or
		//ane &&_하나라도 거짓이면 false
		System.out.println(true && true); //true-and_하나라도 거짓이면 false
		System.out.println(true && false); //false
		
		//or_하나라도 true라면 결과는 true
		System.out.println(true || false); //true
		System.out.println(false || false); //false		
	
	
		if(num1 > 5 && num2 > 30) { //true && false
			System.out.println("실행"); //실행x
		}

		if(num1 > 5 || num2 > 30) { //true || false
				System.out.println("실행"); //실행o
		}
			
			
		}	
	}
	

