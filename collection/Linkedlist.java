package me.training.collection;

//import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		//list.addFirst("darling");
		list.add("nikhil");
		list.add("karne");
		list.add("akhil");
		list.add("kumar");
		
		list.getFirst();
	/*Iterator<String> x=list.iterator();
	while(x.hasNext()) {
		System.out.println(x.next());
		
	}*/
		System.out.println(list.lastIndexOf("abhi"));
	
	}

}
