package Arrays;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args)
	{
		//1. When we want to read Elements/take input from the user
		int[] intArray = new int[5]; 
		//Create a new integer array with a capacity/size of 5 elements and default value 0
		System.out.println(Arrays.toString(intArray));
		
		intArray = new int[10]; 
		//since intArray is a reference, so dereferencing it and now it points to another array
		//with capacity/size of 10 and default value 0 
		System.out.println(Arrays.toString(intArray));
		
		//2. Creating a new Array pointed by intArray2 having predefined elements
		int[] intArray2 = new int[] {1,2,3,4,5,6,7,8,9,10}; // no need to specify the size else throws an error
		System.out.println(Arrays.toString(intArray2));
		
		intArray2 = new int[] {10,9,8,7,6};
		//dereferencing, now intArray points to another predefined array
		System.out.println(Arrays.toString(intArray2));
		
		
		//3. Anonymous Array or Array inline
		int[] intArray3 = {1,2,3,4,5};
		System.out.println(Arrays.toString(intArray3));
		//throws a error - > Array constants can only be used in initializer 
		//used when we want to create an constant array that does not change throughout the whole program
		//intArray3 = {1,2,3,3,4};
	}
}
