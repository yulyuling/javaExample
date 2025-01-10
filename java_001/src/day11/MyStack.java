package day11;

public class MyStack {
		public static void main(String[] args) {
			
		GStack<String> stringStack = new GStack<String>();
		
			stringStack.push("seoul"); //1
			stringStack.push("busan"); //2
			stringStack.push("LA");    //3
		
		for(int n=0; n<3; n++)
			System.out.println(stringStack.pop());
			GStack<Integer> intStack = new GStack<Integer>();
		
			intStack.push(1);
			intStack.push(3);
			intStack.push(5);
		
		for(int n=0; n<3; n++)
			
			System.out.println(intStack.pop());
	}
}


