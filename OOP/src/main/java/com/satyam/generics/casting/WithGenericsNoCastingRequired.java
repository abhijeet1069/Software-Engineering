package com.satyam.generics.casting;

import java.util.ArrayList;
import java.util.List;

public class WithGenericsNoCastingRequired {
	/**
	 * commented to remove warnings
	public static void withoutGenerics() {
		List names = new ArrayList();
		names.add("Fe");
		names.add("Fi");
		names.add("Fo");
		names.add("Fum");
		String first = (String) names.get(0); // casting is mandatory here, from Object to String
		System.out.println(first);
	}
*/
	public static void withGenerics() {
		List<String> names = new ArrayList<>();
		names.add("Fe");
		names.add("Fi");
		names.add("Fo");
		names.add("Fum");
		String first = names.get(0); 
		System.out.println(first);
	}

	/**
	 *  [Fe, Fi, Fo, Fum]
		Fe
	 * */
	
	public static void main(String[] args) {
		withGenerics();
		//withoutGenerics();
	}
}
