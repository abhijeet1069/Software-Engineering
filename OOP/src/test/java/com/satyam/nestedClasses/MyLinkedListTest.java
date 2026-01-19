package com.satyam.nestedClasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	@Test
	void testToString() {
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("Mary");
		list.add("had");
		list.add("a");
		list.add("little");
		list.add("lamb");
		
		assertEquals("Mary->had->a->little->lamb",list.toString());
	}

}
