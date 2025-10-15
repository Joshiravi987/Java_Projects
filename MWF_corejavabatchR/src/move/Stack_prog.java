package move;

import java.util.Stack;

//move this to dsa package
//stack is used to data in LIFO order
// Last In First Out
// Stack is a data structure that allows adding and removing elements in a specific order.
// The last element added is the first one to be removed.
// Stack is often used for tasks like undo operations, parsing expressions, and managing function calls.
// stack is a linear data structure that follows the Last In First Out (LIFO) principle.
// Elements can be added to the top of the stack and removed from the top..
// It is commonly used in algorithms and applications where the order of processing matters.
// Stack operations include push (to add an element), pop (to remove the top element), and peek (to view the top element without removing it).
//stack is implemented using arrays or linked lists or arraylist
//stack is used in many applications such as expression evaluation, backtracking algorithms, and function call management.
//stack is a fundamental data structure in computer science, often used in algorithms and applications where the order of processing matters.
//stack is used in many applications such like undo operations in text editors, parsing expressions, and managing function calls in programming languages.	
//stack is a linear data structure that follows the Last In First Out (LIFO) principle.
public class Stack_prog {
	public static void main(String[] args) {
//create stack
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10); // Add 10 to the stack
		stack.push(20); // Add 20 to the stack
		stack.push(30); // Add 30 to the stack
		stack.push(40); // Add 40 to the stack
		
		//print the stack
		System.out.println("Stack: " + stack);
		
		System.out.println("Top element: " + stack.peek()); // View the top element without removing it
		System.out.println("Popped element: " + stack.pop()); // Remove and return the top element
		
		System.out.println("Stack after pop: " + stack); // Print the stack after popping an element
		
		//add more elements to the stack
		stack.push(50); // Add 50 to the stack
		stack.push(60); // Add 60 to the stack
		System.out.println("Stack after adding more elements: " + stack); // Print the stack after adding more elements
		
		//find the size of the stack
		System.out.println("Size of stack: " + stack.size()); // Get the size of the stack
		
		//check if the stack is empty
		System.out.println("Is stack empty? " + stack.isEmpty()); // Check if the stack is empty
		//check if the stack contains a specific element
		System.out.println("Does stack contain 30? " + stack.contains(30)); // Check if the stack contains the element 30
		
		//find index of an element in the stack
		System.out.println("Index of 50 in stack: " + stack.search(50)+" "); // Find the index of the element 50 in the stack
		
		//find the index of an each element in the stack
		for (Integer i : stack) {
			System.out.println("\tIndex of " + i + " in stack: " + stack.search(i)); // Find the index of each element in the stack
			
			System.out.println("index"+ stack.indexOf(30)+" "); // Find the index of each element in the stack using indexOf method
			
			System.out.println("Element at index 2: " + stack.get(2)); // Get the element at index 2 in the stack
			
			System.out.println("Capicity of stack: " + stack.capacity()); // Get the capacity of the stack
		}
	}

}
