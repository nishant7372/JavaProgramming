package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayInbuiltFunctions {

	public static void main(String[] args)
	{
		int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		//1. Copying an array
		
		//1.1 --> Of Original Dimension
		int[] copiedArray1 = Arrays.copyOf(intArray, intArray.length);
		System.out.println(Arrays.toString(copiedArray1));
		//1.2 --> Of Custom Dimension (Less than Original --> Taking 5)
		int[] copiedArray2 = Arrays.copyOf(intArray, 5);
		System.out.println(Arrays.toString(copiedArray2));
		//1.2 --> Of Custom Dimension (More than Original --> Taking 12)
		int[] copiedArray3 = Arrays.copyOf(intArray, 12);
		System.out.println(Arrays.toString(copiedArray3)); //The Last two elements will be 0.
		
		
		//2. Equals method --> Returns true if the two specified arrays of ints are equal to one another.
 		System.out.println(Arrays.equals(intArray, copiedArray1));
 		
 		//3. Arrays.fill method --> Fill a given Array with Specified Value
 		
 		//3.1. Fill a Range
 		Arrays.fill(copiedArray3, 5, 8, -1);
 		System.out.println(Arrays.toString(copiedArray3));
 		
 		//3.2 Fill Whole
 		Arrays.fill(copiedArray3, -1);
 		System.out.println(Arrays.toString(copiedArray3));
 		
 		//4. Converting to List
 		Integer[] array = new Integer[]{5,4,3,2,1};
 		List<Integer> list = Arrays.asList(array);
 		System.out.println(list);
 		
 		//5.Binary Search
 		System.out.println(Arrays.binarySearch(intArray,5));
 		
 		//6.System.identityHashCode(obj)
 		System.out.println(System.identityHashCode(intArray));
 		System.out.println(System.identityHashCode(copiedArray1));
 		System.out.println(System.identityHashCode(copiedArray2));
 		System.out.println(System.identityHashCode(copiedArray3));
 		System.out.println(System.identityHashCode(array));
 		
 	}
}
