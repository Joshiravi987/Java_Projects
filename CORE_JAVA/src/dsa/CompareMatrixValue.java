package dsa;

import java.util.HashMap;
import java.util.HashSet;

public class CompareMatrixValue {
public static void main(String[] args) {
	int matrix[][] = {{1,2,3},{4,2,4},{8,9,3}
	};
	HashMap<Integer, Integer> map = new HashMap<>();
	for (int[] row : matrix) {
		for (int value : row) {
			// getOrDefault checks if the value is present in the map
			map.put(value, map.getOrDefault(value, 0) + 1);
		}
	}
	for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
		System.out.println("The value " + entry.getKey() + " is repeated " + entry.getValue() + " times");
	}
	HashSet<String> hs = new HashSet<String>();
	hs.add("Amit");
		hs.add("Sumit");
		hs.add("Rahul");
		hs.add("Darshak");
		hs.add("Amit"); // duplicate will not add again
		System.out.println(hs);
}
}
