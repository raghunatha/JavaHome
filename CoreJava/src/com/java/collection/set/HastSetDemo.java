package com.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HastSetDemo {
	private static String name;
	public static void main(String[] args) {
		HashSet hSet = new HashSet();
		HashSetTest hset = new HashSetTest();
		hset = null;
		//hSet.add(hset);
		hSet.add(name);
		//hSet.remove(null);
		Iterator itr = hSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		TreeSet tSet = new TreeSet();
		HastSetDemo demo = new HastSetDemo();
		//demo = null;
		//tSet.add(demo);
		//tSet.remove(null);
		Iterator itr1 = tSet.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}
}
