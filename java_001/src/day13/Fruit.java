package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Fruit {
	static Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	
		public static String setName(String name) {
		
		while(true) {
			System.out.print(name + ": ");
//			String inputName = scan.next();
			String foundName = scan.next();
			if(foundName.equals(name)) {
				return name;
			}
		}
	}
}