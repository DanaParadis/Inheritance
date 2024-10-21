package project;

abstract class Animal {
	
	private String name;
	private int age;
	private double weight;
	
	//Constructor
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	// Method abstract
	public abstract void animalSound();
	
	
	//Method concrete
	
	public void sleep() {
		System.out.println("The animal is sleeping");
		
	}
	 // Method for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
