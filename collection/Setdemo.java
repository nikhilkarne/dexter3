package me.training.collection;

import java.util.HashSet;
import java.util.Set;

public class Setdemo {

	public static void main(String[] args) {
		Set<Student> set=new HashSet<>();
		/*s.add("charan");
		s.add("nikhil");
		s.add("charan");
		s.add("Chaitu");
		s.add("suraj");
		s.add("null");
		
		for(String a:s) {
			System.out.println(a);
		}*/
		Student s1=new Student(1,"charan",234);
		Student s2=new Student(2,"nikhi",234);
		Student s3=new Student(3,"akhi",234);
		Student s4=new Student(4,"ramesh",234);
		Student s5=new Student(1,"suresh",234);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		for(Student s:set) {
			System.out.println(s.getStuNo()+"\t"+s.getStuName()+"\t"+s.getStuNo());
		}
		
	}

}
