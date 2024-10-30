package studio7;

import java.util.Scanner;

public class Complex {
	
	private double a1; 
	private double b1; 
	private double a2; 
	private double b2;
	
	public Complex(double a1, double b1, double a2, double b2){
		this.a1=a1; 
		this.b1=b1;
		this.a2=a2;
		this.b2=b2;
	}
	
	public String Add() {
		double a3 = a1+a2; 
		double b3 = b1+b2; 
		System.out.println(a3 + "+" + b3 +"i");
		return a3 + "+" + b3 +"i";
	}
	
	public String Mult() {
		//System.out.println(a1*a2 + "+" + a1*b2 + "i" + "+" + a2*b1+"i" + "-" + b1*b2);
		System.out.println(a1*a2 - b1*b2 + "+" + (a1*b2 + a2*b1) + "i"); 
		return a1*a2 + "+" + a1*b2 + "i" + "+" + a2*b1+"i" + "-" + b1*b2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  

		System.out.println("What is a1?");
		int a1 = in.nextInt();
		
		System.out.println("What is b1?");
		int b1 = in.nextInt();
		
		System.out.println("What is a2?");
		int a2 = in.nextInt();
		
		System.out.println("What is b2?");
		int b2 = in.nextInt();
		
		Complex c1 = new Complex(a1, b1, a2, b2);
		
		c1.Add();
		c1.Mult();

	}

}
