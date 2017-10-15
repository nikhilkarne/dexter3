package me.training.collection;

public class Exceptiondemo {

	public static void main(String[] args) {
		
		/*System.out.println("i my self is nikhil karne");
		
		int x=10;
		int y=0;
		
		System.out.println("how are today");
		int z=0;
        
		try {
			z=x/y;
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
		System.out.println("result is:"+z);

	}*/
		//System.out.println(get());
		
		validate(19);  
	      System.out.println("rest of the code...");

}
	
	/*public static int get() {
		try {
			return 10;
		}catch(Exception e) {
			return 20;
		}finally {
			return 30;
		}
	}
}*/
	
	static void validate(int age){  
	     if(age<18)  
	      throw new ArithmeticException("not valid");  //throw keyword is used to explicity throw an exception
	     else  
	      System.out.println("welcome to vote");  
	   } 
}
