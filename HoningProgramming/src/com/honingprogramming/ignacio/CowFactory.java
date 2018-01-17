package com.honingprogramming.ignacio;

public class CowFactory {
	public Cow getAnimal(String animalType) {
		if (animalType.equalsIgnoreCase("Cow")) {
			return new Cow(animalType, 5);
		} else {
			System.out.println(animalType + " is not in this CowFactory.");
			return null;

		}
	}
}
