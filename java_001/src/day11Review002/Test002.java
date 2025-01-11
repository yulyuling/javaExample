package day11Review002;

public class Test002 {
public static void main(String[] args) {
	
	int temp2 = 0;
	for(int q = 2; q < 10; q++) {
		for(int w = 1; w < 10; w++) {
			temp2 = q*w;

			if( q == 5 || q == 8) {
				continue;
			}System.out.print(q + "x" + w + "=" + temp2 + "\t");
			System.out.println();
		
		}
	}
}
}
