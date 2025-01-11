package day11Review001_Extends;

public class AnimalMain {
	public static void main(String[] args) {
		
		        Animal[] animals = {
		            new Dog("Buddy", "Golden Retriever"),
		            new Cat("Whiskers", "Black")
		        };

		        for (Animal animal : animals) {
		            animal.maskSound();
		            animal.displayInfo();
		        }
		    }
}
