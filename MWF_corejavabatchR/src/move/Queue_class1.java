package move;

import java.util.LinkedList;
import java.util.Queue;
// Queue is a data structure that allows adding and removing elements in a specific order.
// Queue follows the First In First Out (FIFO) principle, meaning the first element added is the first one to be removed.
// It is commonly used in scenarios like task scheduling, breadth-first search algorithms, and managing requests in a system.
// Queue operations include enqueue (to add an element), dequeue (to remove the front element), and peek (to view the front element without removing it).
// Queue is a linear data structure that follows the First In First Out (FIFO) principle.
// Elements can be added to the back of the queue and removed from the front.


public class Queue_class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer> queue = new LinkedList<Integer>();
queue.add(10); // Add 10 to the queue
		queue.add(20); // Add 20 to the queue
		queue.add(30); // Add 30 to the queue
		queue.add(40); // Add 40 to the queue
		queue.add(50); // Add 50 to the queue
		queue.offer(60); // Add 60 to the queue
		
		//print the queue
		System.out.println("Queue: " + queue);
		//remove an element from the queue
		System.out.println("Front element: " + queue.peek()); // View the front element without removing it
		System.out.println("Removed element: " + queue.poll()); // Remove and return the front element ,remove only the first element in the queue
		System.out.println("Queue 30 removal: " + queue.remove(30)); // Remove the element 30 from the queue ,desired element to be removed
		
		System.out.println("Queue after removal: " + queue); // Print the queue after removing an element
		
		//add more elements to the queue
		queue.add(70); // Add 50 to the queue
		queue.add(80); // Add 60 to the queue
		System.out.println("Queue after adding more elements: " + queue); // Print the queue after adding more elements
		
		//find the size of the queue
		System.out.println("Size of queue: " + queue.size()); // Get the size of the queue
		
		//check if the queue is empty
		System.out.println("Is queue empty? " + queue.isEmpty()); // Check if the queue is empty
		
		//check if the queue contains a specific element
		System.out.println("Does queue contain 30? " + queue.contains(30)); // Check if the queue contains the element 30
		//find index of an element in the queue
		System.out.println("Index of 50 in queue: " + ((LinkedList<Integer>) queue).indexOf(50) + " "); // Find the index of the element 50 in the queue
		//find the index of an each element in the queue
		for (Integer i : queue) {
			System.out.println("\tIndex of " + i + " in queue: " + ((LinkedList<Integer>) queue).indexOf(i)); // Find the index of each element in the queue
		}
		
	}

}
