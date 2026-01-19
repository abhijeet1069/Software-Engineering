package com.satyam.nestedClasses;

public class MyLinkedList<T> {

	public static class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node<T> head;

	public Node<T> getHead() {
		return head;
	}

	public Node<T> add(T data) {
		if (head == null)
			head = new Node<T>(data);
		else {
			Node<T> ptr = head;
			while (ptr.next != null)
				ptr = ptr.next;
			ptr.next = new Node<T>(data);
		}
		return head;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node<T> ptr = head;
		while (ptr != null) {
			if (ptr.next != null)
				sb.append(ptr.data).append("->");
			else
				sb.append(ptr.data);
			ptr = ptr.next;
		}
		return sb.toString();
	}
}
