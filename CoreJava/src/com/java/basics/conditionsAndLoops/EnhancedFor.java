package com.java.basics.conditionsAndLoops;

import java.util.ArrayList;
import java.util.Collections;

public class EnhancedFor {
	enum Season {
		spring, summer, fall, winter
	}

	public static void main(String args[]) {
		
		//Array
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//Enhanced for loop to iterate over an array
		for (int x : nums) {
			System.out.print(x + " ");
			x = x * 10; // no effect on nums
		}
		//When you see the colon (:) read it as "in." The loop above read as "for each int x in nums."

		//enum
		for (Season season : Season.values()) {
			System.out.println(" The season is now " + season);
		}

		//ArrayList
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(10.14);
		list.add(20.22);
		list.add(30.78);
		list.add(40.46);
		Collections.sort(list);
		System.out.println("Finding the maximiu value in a collection : " + Collections.max(list));
		
		double sum = 0.0;
		for (double itr : list)
			sum = sum + itr;
		System.out.println(sum);
	}
}
