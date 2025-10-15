package DSA;
//HashMap is a part of Java's collection framework and is used to store data in key-value pairs.

//HashMap allow only one null key
//Value can be duplicate
//Keys are unique
//It is not synchronize.
//TreeMap is used to store key values in sorted order.
//TreeMap is not thread-safe.
//Thread safe means that multiple threads can access the data structure without causing any inconsistency.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Has_Map {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(4, "C#");
		map.put(3, "C");
		map.put(6, "C++");
		map.put(5, "Js");

		for (Map.Entry<Integer, String> mapel : map.entrySet())// returns set of key-values in pair
		{
			System.out.println(mapel.getKey() + " " + mapel.getValue());
		}
		System.out.println("\nPrinting using keyset method:");
		for (Integer key : map.keySet())// Returns set of keys in map
		{
			System.out.println("Key:" + key + " Value:" + map.get(key));
		}
		System.out.println("\nPrinting using values method:");
		for (String value : map.values()) // Returns a collection of values in map
		{
			System.out.println("Values:" + value);

		}
		System.out.println("Keys:" + map.keySet());// Returns a set of keys in the map

		if (map.containsKey(3)) {
			System.out.println("3rd key is present in the map");
		} else {
			System.out.println("3rd key is not present in map");
		}
		int keybyVal;
		for (Map.Entry<Integer, String> mapel : map.entrySet()) {
			if (mapel.getValue().equals("C#")) {
				keybyVal = mapel.getKey();
				System.out.println("Key value for C# is:" + keybyVal);
				break;
			}

		}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("\nEnter key and values:");
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);
		}
		for (Map.Entry<Integer, String> mapEle : map.entrySet()) {
			System.out.println("Key:" + mapEle.getKey() + " Values:" + mapEle.getValue());
		}

	}

}