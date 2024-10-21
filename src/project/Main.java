package project;

//Dana N. Paradis Echevarria
//Y00646119
//COMP

public class Main {

	public static void main(String[] args) {
		Animal dog = new Dog("Max", 5);
        Animal cat = new Cat("Daisy", 3);

       dog.animalSound(); // print the sound of the dog
       dog.sleep(); // print that the dog is sleeping 
       System.out.println("Dog weight: " + dog.getWeight() + " kg");// print the weight of the dog 
       
        cat.animalSound();  
        cat.sleep();  
        System.out.println("Cat weight: " + cat.getWeight() + " kg");

	}

}
