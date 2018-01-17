package com.honingprogramming.ignacio;

public class DogFactory {
	public Dog getAnimal(String animalType) {
		if (animalType.equalsIgnoreCase("Dog")) {
			return new Dog(animalType, 0);
		} else {
			System.out.println(animalType + " is not in this DogFactory.");
			return null;

		}
	}
}
