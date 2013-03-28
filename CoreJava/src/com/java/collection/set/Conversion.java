/*
Copy all elements of Java HashSet to an Object Array and an Array to HasSet Example
*/

package com.java.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conversion {

	public static void main(String[] args) {

		// create object of HashSet
		HashSet<Integer> hSet = new HashSet<Integer>();

		// add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		/*
		 * To copy all elements of java HashSet object into array use Object[]
		 * toArray() method.
		 */
		Object[] objArray = hSet.toArray();

		// display contents of Object array
		System.out
				.println("HashSet elements are copied into an Array. Now Array Contains...");
		for (int index = 0; index < objArray.length; index++)
			System.out.println(objArray[index]);

		// ==================================================================================================

		// create an aryay
		String[] UserInput = { "C", "C++", "java", ".net", "cobol" };

		/*
		 * To copy all elements of an array into HashSet object use asList()
		 * method.
		 */
		List<String> list = Arrays.asList(UserInput);
		Set<String> hashSet = new HashSet<String>(list);

		// display the contents of the Set
		System.out
				.println("Array elements are copied to a list. Now List Contains...");
		System.out.println(hashSet);

	}
}