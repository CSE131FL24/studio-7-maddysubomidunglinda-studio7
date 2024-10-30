package studio7;

import java.util.Scanner;

public class Fraction {

	private int numerator1;
	private int denominator1; 

	private int numerator2; 
	private int denominator2; 

	public Fraction (int numerator1, int denominator1, int numerator2, int denominator2) {
		this.numerator1 = numerator1;
		this.denominator1 = denominator1;
		this.numerator2 = numerator2; 
		this.denominator2 = denominator2; 

	}

	public String addition() {
		if (denominator1 == denominator2) { 
			System.out.println(numerator1 + numerator2 + "/" + denominator1);
			return numerator1 + numerator2 + "/" + denominator1;
		}
		System.out.println(numerator1*denominator2 + numerator2*denominator1 + "/" + denominator1 * denominator2);
		return numerator1*denominator2 + numerator2*denominator1 + "/" + denominator1 * denominator2; 

	}

	public String multiplication () {
		System.out.println(numerator1*numerator2 + "/" + denominator1 * denominator2);
		return numerator1*numerator2 + "/" + denominator1 * denominator2;
	}

	public String reciprocal () {
		System.out.println(denominator1 + "/" + numerator1);

		return denominator1 + "/" + numerator1; 
	}

	public String simplification () {

		if (denominator1>numerator1) {

			if (denominator1 % numerator1 == 0) {
				System.out.println(1 + "/" + denominator1/numerator1);

				return 1 + "/" + denominator1/numerator1;
			}
		}
		
		if (numerator1 % denominator1 ==0) {
			System.out.println(numerator1 / denominator1 + "");
			return numerator1 / denominator1 + "";
		}
		
		System.out.println(numerator1 + "/" + denominator1);
		return numerator1 + "/" + denominator1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  

		System.out.println("what is the numerator of fraction 1?");
		int num1 = in.nextInt();
		System.out.println("What is the denominator of fraction 1?");
		int denom1 = in.nextInt();
		System.out.println("what is the numerator of fraction 2?");
		int num2 = in.nextInt();
		System.out.println("What is the denominator of fraction 2?");	
		int denom2 = in.nextInt();
		
		Fraction f1 = new Fraction(num1, denom1, num2, denom2);
		
		f1.addition();
		f1.multiplication();
		f1.simplification();
		f1.reciprocal();

	}

}
