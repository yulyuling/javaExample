package day11;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = scan.next();
		
		for(int i =0; i<str.length(); i++) {
		String first = str.substring(0, 1);
		String last = str.substring(1);
		str = last + first;
		System.out.println(str);
	}
		
			}
		}			
