package day7Review;

public class DogMain { //입력 // 만드는 공장
public static void main(String[] args) {
	
	
	
//	DogMain dog = new DogMain();
//	String name = "봄";
//	String eat = "냠냠";
//	int age = 7;{
		Dog bome = new Dog("봄", 7, "냠냠"); //이건 DogMain에서 생성해야 함.
	
		System.out.println(bome.getName() + "이는 간식을 "+ bome.getEat() + " 나이는 " + bome.getAge() + "살 입니다." );
	
		/*
		 * // Getter를 사용해 필드 값 출력
		 * System.out.println(bome.getName() + "이 " +
		 * bome.getEat() + " 나이는 " + bome.getAge() + " 입니다.");
		 * 
		 * // Setter를 사용해 필드 값 변경
		 * bome.setName("여름");
		 * bome.setAge(8);
		 * bome.setEat("쩝쩝");
		 */
}	
}

