package me.training.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdemo {

	public static void main(String[] args) {
		Map<Integer,Student> map=new Hashtable<>();
		
		Student s1=new Student(1,"charan",13143);
		Student s2=new Student(2,"rupa",2436);
		Student s3=new Student(3,"arprit",4567);
		Student s4=new Student(4,"Suresh",4567);
		Student s5=new Student(5,"charan",4567);
		
		map.put(3, s1);
		map.put(4, s2);
        map.put(1, s3);
		map.put(2, s4);
		map.put(5, s5);
		map.put(4, s4);
		
		/*Set<Integer> keys=map.keySet();
		Iterator<Integer> it=keys.iterator();
		while(it.hasNext()) {
			int key=it.next();
			System.out.println(key+"="+map.get(key));
		}*/
		
		Set<Entry<Integer,Student>> set=map.entrySet();
		Iterator<Entry<Integer,Student>> it=set.iterator();
		while(it.hasNext()) {
			Entry<Integer,Student> entry=it.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		




		
		

	}

}
