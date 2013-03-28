class Outer11{
   private String x = "instance variable";
   void doStuff(){
      final String z = "local variable";
      class Inner{
          public void seeOuter(){
          System.out.println("Outer x is : "+ x);  
          System.out.println("Local variable z is : " + z); //won't compile
         }
      } 
  }
   public static void main(String[] args) {
	
}
}

//why inner class declared inside a method can access only final local variables
//link is in notes.txt