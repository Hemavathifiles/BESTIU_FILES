package org.tns.capgemini.c2tc.Collections;

import java.util.Stack;

public class StackSearchDemo {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(34);  
		stack.push(56);
		stack.push(78);
		stack.push(90);
		stack.push(56);
		
		
		//searching(1 - based indexing)
		System.out.println("Position of 34 " + stack.search(34)); //4 
		System.out.println("Position of 56 " + stack.search(56)); //3
		System.out.println("Position of 78 " + stack.search(78)); //2
		System.out.println("Position of 90 " + stack.search(90)); //1
		System.out.println("Position of 56 " + stack.search(56)); //1
		
		stack.pop();
		System.out.println(stack);
		
	}

}
