class ABC{
	static int i = 2;
     class XYZ{
        private int x=10;
        
        void add(){
        	System.out.println(i);
        }
        
        void mul(){
        	XYZ xyz = new XYZ();
        	sub();
        }
    }

    public static void main(String... args){
        ABC.XYZ yy = new ABC().new XYZ();
    	//XYZ yy = new XYZ();
        System.out.println("Hello :: "+yy.x); ///Why is this allowed??
        yy.add();
        yy.mul();
    }
    
    public void sub(){
    	System.out.println("outer sub");
    }
}