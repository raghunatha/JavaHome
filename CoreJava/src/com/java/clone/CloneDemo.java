package com.java.clone;

public class CloneDemo implements Cloneable {
	private int number;
	private transient int data;

	/**
	 * 
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		CloneDemo clone = new CloneDemo();
		clone.number = 5;
		clone.data = 1000;

		try {
			//
			// Create a clone of CloneDemo object. When we change the value of
			// number and data field in the cloned object it won't affect the
			// original object.
			//
			CloneDemo objectClone = (CloneDemo) clone.clone();
			
			System.out.println("origin object = " + clone);
			System.out.println("cloned object = " + objectClone);
			
			System.out.println("");
			objectClone.number = 10;
			objectClone.data = 5000;			
			System.out.println("");
			
			System.out.println("Values After modifying cloned object");
			System.out.println("origin object = " + clone);
			System.out.println("cloned object = " + objectClone);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		return "[number = " + number + "; data = " + data + "]";
	}
}