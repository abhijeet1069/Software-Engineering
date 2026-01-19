package com.satyam.interfaces;

interface Movable{
	int a = 2;
	void moves();
}

interface Consume extends Movable{
	int b = 4;
	void eats();
}

class Animal1 implements Consume{

	@Override
	public void moves() {
		System.out.println(a);
		
	}

	@Override
	public void eats() {
		System.out.println(b);
		
	}
	
}

public class CheckInterfaces {
	public static void main(String[] args) {
		Animal1 a = new Animal1();
		a.moves();
		a.eats();
	}
}
