package me.training.collection;

public class Student {
	private int stuNo;
	private String stuName;
	
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuphone() {
		return stuphone;
	}
	public void setStuphone(int stuphone) {
		this.stuphone = stuphone;
	}
	private int stuphone;
	public Student(int stuNo, String stuName, int stuphone) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuphone = stuphone;
	}
	public int hashcode() {
		return (int)(stuNo+stuName.hashCode()+stuphone);
	}
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		if(this.stuNo==s.stuNo)
		return true;
		
		else
			return false;
	}

}
