package day10;

public class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s1 = new Sample("홍길동", 30);
		//Sample은 (s1) =>> 주소를 갖고 있음
		s1.age = 31; //해당 주소(Sampl=s1)의 age값을 변경 [this.]
		Sample s1_sub = s1.obj(); //s1_sub엔 뭐가 담김? ==>s1의 주소 //this가 가르키는 곳이 s1이라서.
		s1_sub.age = 40;
		System.out.println(s1.age);
		s1.money = 50000;
		
		Sample s2 = new Sample("김철수", 35);
		//Sample (s2) =>>
		//같은 Sample로 만들었지만 s1,s2의 주소는 아예 다르다. [this.]
		s2.age = 36;
		System.out.println(s2.age);
	} //sample.age=30 = 은 안됨. 

}
