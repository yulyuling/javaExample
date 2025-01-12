package day11Review_Abstract_Interpace2;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal[] animals = {
                new Mammal("Lion", 5),
                new Bird("Eagle", 3),
                new Fish("Shark", 8)
            };

            for (Animal animal : animals) {
                animal.displayInfo();
                animal.makeSound();
                animal.move();

                if (animal instanceof Swimmable) {
                    ((Swimmable) animal).swim();
                }
                if (animal instanceof Flyable) {
                    ((Flyable) animal).fly();
                }
                System.out.println();
            }
        }

	}


