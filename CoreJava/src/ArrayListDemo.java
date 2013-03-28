import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {

	private static String name;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//ways to create an arrayList
		ArrayList arrList = new ArrayList();
		List l1 = new ArrayList();
		
		//adding elements in the array list
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(name);
		l1.add(3);
		l1.add("raghu");
		l1.add("raghu");
		l1.add(name);
		
		//printing the value at index 1
		System.out.println("value at index 1: " + l1.get(1));
		
		//using for loop
		for(int index = 0; index<l1.size(); index++){
			System.out.println("The value at index " + index + " is = " + l1.get(index));
		}
		
		
		//using enhanced forloop
		for(Object x : l1){
			System.out.println(x);
		}
		
		/*String[] arrStr = new String[2];
		arrStr[0]="raghu";
		arrStr[1] = "naveen";
		
		for(String x : arrStr){
			System.out.println(x);
		}*/
		
		//1 , 2, 3
		//using Iterator
		Iterator raghu = l1.iterator();
		while(raghu.hasNext()){
			System.out.println(raghu.next());
		}
		
	}

}
