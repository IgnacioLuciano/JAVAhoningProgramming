package com.honingprogramming.ignacio;

public class Animal {

	private String name;
	private int age;

	public Animal(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public void printDetails() {
		System.out.println(this.name + this.age);
		
	}
 }
