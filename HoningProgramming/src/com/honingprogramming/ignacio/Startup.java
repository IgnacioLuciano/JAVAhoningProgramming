package com.honingprogramming.ignacio;

public class Startup {

	private static Object name;
	private static Object age;
	private static Object animalType;

	public static void main(String[] args) {
		
		CatFactory catFactory = new CatFactory();
		DogFactory dogFactory = new DogFactory();
		CowFactory cowFactory = new CowFactory();
		
		Cat cat = catFactory.getAnimal("Cat");
		Cow cow = cowFactory.getAnimal("Cow");
		Dog dog = dogFactory.getAnimal("Dog");
		
		

		cat.printDetails();
//		
//		Animal dog = new Dog("Guau", 9);
		dog.printDetails();
//		
//		Animal cow = new Cow("Muu", 3);
		cow.printDetails();
	}

}
