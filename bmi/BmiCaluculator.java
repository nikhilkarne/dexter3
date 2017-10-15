package me.bmi;

import java.util.Scanner;

public class BmiCaluculator {
public static void main(String[] args) {
	System.out.println("enter the gender  of the person (m/f)");
	
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	System.out.println("enter the height of the person ");
	double feet=sc.nextDouble();
	double meters=feet*0.304;
	System.out.println("enter the weight of the person");
	double pounds =sc.nextDouble();
	double kilograms=pounds*0.454;
	double bmi=kilograms/(meters*meters);
	
	if(c=='m'){
		System.out.println("YOU ARE MALE");
	
	if(bmi<18.5) {
		System.out.println("person is underweight");
	}
	    else if(bmi>=18.5&&bmi<24.9){
		System.out.println("person is healthy weight");
	    }
		else if(bmi>=25 && bmi<29.9) {
			System.out.println("person is over weight");
		}
		else if(bmi>=30){
		System.out.println("person is obese");
	}
	}
	else  {
		System.out.println("yOU ARE FEMALE");
		if(bmi<16.5) {
			System.out.println("person is underweight");
		}
	
		    else if(bmi>=16.5 &&bmi<23.9){
			System.out.println("person is healthy weight");
		    }
			else if(bmi>=24 && bmi<27.9) {
				System.out.println("person is over weight");
			}
			else if(bmi>=28){
			System.out.println("person is obese");
			}
		
	}
	System.out.println("the person bmi is:"+bmi);
	}
}


