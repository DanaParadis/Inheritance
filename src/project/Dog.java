package project;

class Dog extends Animal {
	 // Constructor
    public Dog(String name, int age) {
        super(name, age); 
        setWeight(12.0);
    }

    @Override
    public void animalSound() {
        System.out.println("The dog is barking.");
   
    }
   
    @Override 
    
    public void sleep() {
    	super.sleep();
    	System.out.println("The dog is sleeping");
    }

}
