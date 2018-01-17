package com.honingprogramming.ignacio;

public class Startup {

	private static Object name;
	private static Object age;
	private static Object animalType;

	public static void main(String[] args) {
		
		CatFactory catFactory = new CatFactory();
		DogFactory dogFactory = new DogFactory();
		CowFactory cowFactory = new CowFactory();
		
		Cat cat = (Cat) catFactory.getAnimal("Ct");
		Cow cow = cowFactory.getAnimal("Cw");
		Dog dog = (Dog) dogFactory.getAnimal("Dg");
		
		
//		Animal cat = new Cat("Meau", 8);
		cat.printDetails();
//		
//		Animal dog = new Dog("Guau", 9);
		dog.printDetails();
//		
//		Animal cow = new Cow("Muu", 3);
		cow.printDetails();
	}

}
