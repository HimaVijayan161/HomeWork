package com.march.datastructures;

import java.util.Arrays;

public class StackImplementation {
	int size;

	int top = -1;

	int arr[];

	public StackImplementation(int size) {
		this.size = size;
		this.top = -1;
		this.arr = new int[size];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == size - 1);
	}

	public int peek() {
		if (!this.isEmpty())

			return arr[top];

		else {
			System.out.println("stack is empty");
			return -1;
		}
	}

	public void push(int element) {
		if (!this.isFull()) {
			top++;
			this.arr[top] = element;
			System.out.println("element " + element + " is added at " + top);
		} else {
			System.out.println("stack is full");
		}
	}

	public int pop() {
		if (!this.isEmpty()) {
			int currentTop = top;
			top--;
			System.out.println("removed the current top element " + arr[currentTop]);
			return arr[currentTop];
		}

		else {
			System.out.println("stack is empty");
			return -1;
		}
	}

	
	@Override
	public String toString() {
		return "StackImplementation [size=" + size + ", top=" + top + ", arr=" + Arrays.toString(arr) + "]";
	}

	public static void main(String args[]) {
		StackImplementation s1 = new StackImplementation(5);
/*		s1.push(5);
		s1.push(5);
		s1.push(5);
		s1.push(5);
		s1.push(5);
		
		System.out.println(s1);

		s1.push(5);*/
		
		s1.push(5);
		s1.push(4);
		s1.push(3);
		s1.push(2);
		s1.push(1);
		
		System.out.println(s1);

		s1.push(8);
		System.out.println(s1.peek());
		
		System.out.println(s1.pop());
		
		System.out.println(s1);


	}
}
