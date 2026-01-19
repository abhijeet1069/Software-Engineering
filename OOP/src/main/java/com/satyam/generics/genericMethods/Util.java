package com.satyam.generics.genericMethods;

public class Util {

	/**
	 * The <T> before return type means this is a generic method.
	 */
	public static <T> void printArray(T[] arr) {
		for (T el : arr)
			System.out.print(el + " ");
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 12, 4, 23, 232, 2 };
		printArray(arr);

	}
}
