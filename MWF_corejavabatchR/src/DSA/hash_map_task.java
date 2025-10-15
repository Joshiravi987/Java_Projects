package DSA;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class hash_map_task {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			int choice = 0;
			do {
	System.out.println("1: Add id and name");
	System.out.println("2: Fetch name by id");
	System.out.println("3: Remove name by id");
	System.out.println("4: Display id and name");
	System.out.println("5: Exit");
	System.out.println("Enter your choice:");
	choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("How many entries do you want to add?");
					int addCount = sc.nextInt();
					for (int i = 1; i < addCount; i++) {
						System.out.println("Enter id and name for entry " + (i) + ":");
						int id = sc.nextInt();
						String name = sc.next();
						map.put(id, name);
					}
					System.out.println("Enter id and name:");
					int id = sc.nextInt();
					String name = sc.next();
					map.put(id, name);
					break;
				case 2:
					System.out.println("Enter id to fetch name:");
					int fetchId = sc.nextInt();
					if (map.containsKey(fetchId)) {
						System.out.println("Name for id " + fetchId + " is: " + map.get(fetchId));
					} else {
						System.out.println("Id not found.");
					}
					break;
				case 3:
					System.out.println("Enter id to remove:");
					int removeId = sc.nextInt();
					if (map.containsKey(removeId)) {
						map.remove(removeId);
						System.out.println("Removed id " + removeId);
					} else {
						System.out.println("Id not found.");
					}
					break;
				case 4:
					System.out.println("Displaying all ids and names:");
					for (Map.Entry<Integer, String> entry : map.entrySet()) {
						System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
					}
					break;
				case 5:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			} while (choice != 5);

		}

	}

