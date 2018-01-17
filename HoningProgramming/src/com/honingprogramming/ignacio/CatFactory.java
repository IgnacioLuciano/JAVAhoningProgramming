package com.honingprogramming.ignacio;

public class CatFactory {
	public Cat getAnimal(String animalType) {
		if (animalType.equalsIgnoreCase("Cat")) {
			return new Cat(animalType, 0);
		} else {
			System.out.println(animalType + " is not in this CatFactory.");
			return null;

		}
	}
}
