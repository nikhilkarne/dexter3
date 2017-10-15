package me.training.collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List<Comparable> l=new ArrayList<Comparable>();
		l.add("charan");
		l.add("nikhil");
		l.add('c');
		l.add(3,"nikhi");
		l.add(-2);
		l.add('c');
		l.add(-2);
		
	//
		//for(int i=0;i<l.size();i++) {
			//System.out.println(l.get(i));
		//}
		//.out.println(l.get(2));
		//l.remove(2);
		//System.out.println(l.get(2));
		for(Object i:l) {
			System.out.println(i);
		}
	
		
		
		
	
		
	
	}

}
