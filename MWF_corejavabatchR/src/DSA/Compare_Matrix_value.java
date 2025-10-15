package DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class Compare_Matrix_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int matrix[][] = {{1,2,3},{4,2,4},{8,9,3}
	};
HashMap<Integer, Integer> map = new HashMap<>();
for (int[]row:matrix) {
	for (int value : row) {
		//getOrDefault checks if the value is present in the ma
		map.put(value, map.getOrDefault(value, 0)+1);
	}
}
for (Map.Entry <Integer, Integer> entry: map.entrySet()) {
	System.out.println("The value" +entry.getKey() +"is repeated " +entry.getValue() +"times");
}

HashSet<String> hs = new HashSet<String>();
hs.add("Amit");
hs.add("Sumit");
hs.add("Rahul");
hs.add("Darshak");
hs.add("Amit"); //duplicate will not add again
System.out.println(hs);



}
}