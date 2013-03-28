/*
 * Using the arraycopy method to copy the contents from one array to other
 */

package com.java.arrays;

class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        //copy data from one array to another
        //The parameters are : Source array, starting index, destination array, staring index, end index 
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
        
        //Array index out of bounds : destination array size is 7 but we are trying to insert 8 elements
        //System.arraycopy(copyFrom, 2, copyTo, 0, 8);
    }
}
