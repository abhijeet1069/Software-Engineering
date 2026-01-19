package com.satyam.generics.genericClasses;

/**
 * Generic classes are classes with type parameter.
 * Here T is a type parameter - it will be replaced by a real type (Intger, String etc.)
 * when the class is used.
 * */

public class Box<T> {
	private T value;
	
	public void set(T value) {
		this.value = value;
	}
	
	public T get() {
		return value;
	}
	
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		intBox.set(42);
		System.out.println(intBox.get());  // 42
	}
}
