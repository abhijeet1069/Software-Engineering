package com.satyam.interfaces;

import java.util.ArrayList;
import java.util.List;

//---------- Diet marker interfaces ----------

interface Herbivore {
	void eatPlants();
}

interface Carnivore {
	void eatMeat();
}

abstract class Animal {
	private final String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void makeSound();

	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + name + ")";
	}
}

class Goat extends Animal implements Herbivore {

	public Goat(String name) {
		super(name);
	}

	@Override
	public void eatPlants() {
		System.out.println(getName() + "munches plant.");
	}

	@Override
	public void makeSound() {
		System.out.println("Bleat!!");

	}

}

class Cow extends Animal implements Herbivore {
	public Cow(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Moo!");
	}

	@Override
	public void eatPlants() {
		System.out.println(getName() + " eats hay.");
	}
}

class Tiger extends Animal implements Carnivore {
	public Tiger(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Roar!");
	}

	@Override
	public void eatMeat() {
		System.out.println(getName() + " rips into meat.");
	}
}

class Lion extends Animal implements Carnivore {
	public Lion(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Roar!");
	}

	@Override
	public void eatMeat() {
		System.out.println(getName() + " devours meat.");
	}
}

//---------- Generic type-safe Cage ----------
/*
 * T must be an Animal and also satisfy the diet marker interface you choose
 * (e.g., Herbivore or Carnivore).
 */

class Cage<T extends Animal> {
	private final List<T> occupants = new ArrayList<>();
	private final int capacity;

	public Cage(int capacity) {
		this.capacity = capacity;
	}

	public boolean add(T animal) {
		if (occupants.size() >= capacity) {
			System.out.println("Cage is full. Cannot add: " + animal);
			return false;
		}
		occupants.add(animal);
		System.out.println("Added " + animal + " to cage.");
		return true;
	}

	public boolean remove(T animal) {
		boolean removed = occupants.remove(animal);
		if (removed)
			System.out.println("Removed " + animal + " from cage.");
		return removed;
	}

	public List<T> listAnimals() {
		List<T> copy = new ArrayList<>(occupants);
		return copy;
	}

	public boolean isFull() {
		return occupants.size() >= capacity;
	}
}

//T must be a subclass of animal and must also implement the Herbivore interface
class HerbivoreCage<T extends Animal & Herbivore> extends Cage<T> {
	public HerbivoreCage(int capacity) {
		super(capacity);
	}
}

class CarnivoreCage<T extends Animal & Carnivore> extends Cage<T> {
	public CarnivoreCage(int capacity) {
		super(capacity);
	}
}

public class Zoo {
	public static void main(String[] args) {
		HerbivoreCage<Goat> goatCage = new HerbivoreCage<>(3);
		
		Goat g1 = new Goat("Billy");
		Goat g2 = new Goat("Nanny");
		goatCage.add(g1);
		goatCage.add(g2);
		System.out.println(goatCage);
	}
}
