package OOPS.array;
//what is an array?
//An array is a collection of similar data types that are stored in contiguous memory locations.
//Array are used to store multiple values in a single variable, instead of declaring separate variables for each value.
public class array {
public array() {
	int[] arr = new int[5]; // declaration and instantiation
	arr[0] = 12; // initialization
	arr[1]= 15;
	arr[2]=17;
	arr[3]=19;
	arr[4]=21;
	// array of using new keyword
	//create an array using array literal
	int[] arr2 = {1,2,3,4,5}; // declaration, instantiation and initialization
	//printing the array
	for (int i =0 ; i < arr.length; i++) {
		System.out.println("first array: " + arr[i]);
		
	}
	for (int i =0 ; i < arr2.length; i++) {
		System.out.println("second arrat: " + arr2[i]);
	}
	//for each loop
	for (int ele : arr2) {
		System.out.println("for each loop: :" + ele);
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new array(); // creating an object of the array class to call the constructor
	}

}
