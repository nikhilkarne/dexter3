package me.training.collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class ArraylistDemo {

	public static void main(String[] args) {
		
		List<Student> l=new ArrayList<>();
		
		/*l.add("niki");
		l.add("nikhil");
		l.add("raju");
		l.add("shekar");
		l.add("irwin");*/
		
		
		/*Collections.sort(l, new MyComparator());
		
		for(Student s:l) {
			System.out.println(s);
		}*/
		
		
		Student s1=new Student(1,"nikhil",123);
		Student s2=new Student(4,"Akhi",124);
		Student s3=new Student(5,"akhil",125);
		Student s4=new Student(2,"mister",126);
		Student s5=new Student(3,"seethu",127);
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
		Collections.sort(l,new MyComparator());
		
		for(Student s:l) {
			System.out.println(s.getStuNo()+"\t"+s.getStuName()+"\t"+s.getStuphone());
		}
		
		/*ListIterator<Student> it=l.listIterator();
		
		while(it.hasNext()) {
			Student s= it.next();
			l.set(2,new Student(2,"karne",124));
			System.out.println(s.getStuNo()+"\t"+s.getStuName()+"\t"+s.getStuphone());
		}
			
			System.out.println("to print reverse");
			
	    while(it.hasPrevious()) {
	    	Student s=it.previous();
	    	System.out.println(s.getStuNo()+"\t"+s.getStuName()+"\t"+s.getStuphone());
	    }*/
	    	
	}

}
