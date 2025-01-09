package day10Test001;

public class Dog extends Animal{

		
		// Dog 객체 생성
//        Animal dog = new Animal("바둑이", 3, "진돗개");
        
//        dog.info("바둑이", 3); // 이름 : 바둑이, 나이 : 3
//        dog.sound("멍멍!"); // 멍멍!
//        System.out.println("품종 : " + dog.getBreed()); // 품종 : 진돗개
//        
//        Dog dog2 = new Dog();
//        dog2.info("정보없음", 0); // 이름 : 정보없음, 나이 : 0ain(String[] args) {
	
	String breed;
		Dog(){
			super("알 수 없음", 0);

		}	
        Dog(String name, int age, String breed){
        	super(name, age);
        	this.breed;
        }
        @Override
        void sound() {
        	System.out.println("멍멍");
        }
        String getBreed() {
        	return breed;
        }
}


