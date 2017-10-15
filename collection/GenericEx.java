package me.training.collection;

public class GenericEx <T>{
	
	public void doAdd(T a,T b) {
	
	System.out.println(a);
	
	System.out.println(b);

}
	public static void main(String[] args) { 
		//GenericEx<Integer> ex =new GenericEx<>();
		//ex.doAdd(10,11);
		GenericEx<String> ex1=new GenericEx<>();
		ex1.doAdd("nikhil", "akhil");
	}
	}
