
public class Outer {

	static int i = 5;
	
	 class inner{
		//static int i = 6;
		/*public static void main(String[] args) {
			//int i = 7;
			System.out.println(i);
		}*/
		
		public void add(){
			System.out.println("inner add");
		}
		
		int j;
		
		
	}
	
	public static void main(String[] args) {
		Outer o1 = new Outer();
		inner i1 = o1.new inner();
		//inner i1 = new inner();
		i1.add();
		System.out.println(i1.j);
	}
	
}


class Outer1 {

	static int i = 5;
	
	static class inner{
		//static int i = 6;
		public static void main(String[] args) {
			//int i = 7;
			System.out.println(i);
		}
		
		
	}
	
}
