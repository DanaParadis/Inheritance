package project;

class Cat extends Animal {
	
	//Constructor
	
	public Cat (String name, int age) {
		super(name, age);
		setWeight(10.0);
	}
	
	@Override
    public void animalSound() {
		   System.out.println("The cat is getting ready to meow.");
	}
		   
	 @Override 
    public void sleep() {
		 System.out.println("The cat is sleeping");
    	
   
    } 
		
}