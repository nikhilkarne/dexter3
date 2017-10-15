package me.training.collection;

public class Exceptionpropogation {


	    void m() {
	    	 int z=10/0;
	    }
	    void n(){
	    	m();
	    }
	    void p() {
	    	try {
	    		n();
	    	}catch(Exception e) {
	    		System.out.println("exception handled");
	    	}
	    }

	
public static void main(String[] args) {
	Exceptionpropogation a1=new Exceptionpropogation();
	a1.p();
	
System.out.println("this is very good ");
}

}
