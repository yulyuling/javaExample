package day7Review;

public class Dog { //출력 // 설계도
	
	
	private String name;  //필드
	private int age;
	private String eat;
	
//	Dog nome = new Dog("봄", 7, "냠냠"); //이걸 dogmain에서 해야 함.
	
	Dog(String name, int age, String eat){ //생성자 Constructor
	this.name = name;						// this는 현재 객체를 가리킴.
	this.age = 7;
	this.eat = eat;
	}
	
	
		 
		 


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}
	
	}