package me.training.Nikij2se.Overriding;

public class Child1 extends Parent {
	public void printval(){
		System.out.println(b/a);
		System.out.println(docal());
	}
	public int performaction(int x ,int y){
	//System.out.println("my name is nikhil");
	return super.performaction(2, 3);
	}
}
