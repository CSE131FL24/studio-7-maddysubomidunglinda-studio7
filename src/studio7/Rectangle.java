package studio7;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;



public class Rectangle {
	
	private double length; 
	private double width; 
	private boolean square; 
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width; 
	}
	

	public boolean isSquare(){ 
		if (length == width) {
			square = true; 
			System.out.println("this is a square");
		}
		if (length != width) {
			square = false; 
			System.out.println("this is NOT a square");
		}
		
		return square;
	}
	
	public double area() {
		double area = length*width;
		System.out.println("The area is " + area);
		return area;
		
	}
	
	public double perimeter() {
		double perimeter = 2*length + 2*width;
		System.out.println("The perimeter is " + perimeter);
		return perimeter; 
	}
	
	public void drawRectangle() {
		StdDraw.rectangle(.5, .5, length/2, width/2);
	}
	
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);  

		// TODO Auto-generated method stub
		
		System.out.println("What is the length?");
		double l = in.nextDouble();
		
		System.out.println("What is the width?");
		double w = in.nextDouble();
		
		
		Rectangle r1 = new Rectangle(l, w); 
		
		r1.area(); 
		r1.perimeter();
		r1.isSquare();
		r1.drawRectangle();

	}

}
