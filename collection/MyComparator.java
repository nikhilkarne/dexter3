package me.training.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		//return o1.getStuNo()-o2.getStuNo();
		return o1.getStuName().compareTo(o2.getStuName());
	}
    
}
