package com.satyam.generics.boundedTypeParameters;

/**
 * Restrict what types can be used as a type parameter.
 * 
 * We can apply multiple bounds like:
 * <T extends Number & Comparable<T>> - T must be a subtype of both Number and
 * Comparable<T>.
 * So T must be some class that already implements both of those interfaces 
 * (or extends from a class that does).
 * */
public class NumberBox<T extends Number & Comparable<T>> {
	private T num;

	public NumberBox(T num) {
		this.num = num;
	}

	public double doubleValue() {
		return num.doubleValue();
	}
	
	public static void main(String[] args) {
		NumberBox<Integer> i = new NumberBox<>(10);
		System.out.println(i.doubleValue());
		
		
		//NumberBox<String> j = new NumberBox<>("Fe"); //error
		
	}
}
