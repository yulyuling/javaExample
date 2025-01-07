package day7Review;

public class Cat {
	
	
	private String eat;
	private int age;
	private String cry;
	private String name;
	
	Cat(String name, int age, String cry, String eat){
		
		this.name = name;
		this.age = age;
		this.cry = cry;
		this.eat = eat;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCry() {
		return cry;
	}

	public void setCry(String cry) {
		this.cry = cry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

	