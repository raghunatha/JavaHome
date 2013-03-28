
public class A {

	public void add(){
	
		try{
			//System.exit(1);
			int c = 5/0;
			
		}catch(Exception e){
			throw new ArithmeticException();
		}
		
		finally{
			System.out.println("abc");
		}
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		try{
		a.add();
		}catch(Exception e){
			System.out.println("main method");
		}
	}
}
