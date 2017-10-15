package me.abc;

public class Overloading {
	static float area;
	
	public static float area(int a) {
		
		
		float area = a*a;
		return area;
		
		
		}
	public  static float area(int h,int w) {
	float area=h*w;
		return area;
	}
	public static void main(String[] args) {
		System.out.println("area of the square:"+Overloading.area(2));
		System.out.println("area of the rectangle:"+Overloading.area(4,6));
		

	}

	

}
