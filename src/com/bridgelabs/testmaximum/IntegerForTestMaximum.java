package com.bridgelabs.testmaximum;
import java.util.Scanner;
public class IntegerForTestMaximum {
	static Scanner sc = new Scanner(System.in); 
	
	static void integerForTestMaximum() {
		System.out.println("Enter first number = ");
		TestMaximum.num1 = sc.nextInt();
		System.out.println("Enter second number = ");
		TestMaximum.num2 = sc.nextInt();
		System.out.println("Enter third number = ");
		TestMaximum.num3 = sc.nextInt();
		
	}
	
	static  void calculatingMaximumInt(Integer subNum1,Integer subNum2,Integer subNum3) {
		if((TestMaximum.num1).compareTo(TestMaximum.num2) == 1 && (TestMaximum.num1).compareTo(TestMaximum.num3) == 1)
			{
				System.out.println("Maximum integer is = " + TestMaximum.num1 );
			}
		else if((TestMaximum.num2).compareTo(TestMaximum.num1) == 1 && (TestMaximum.num2).compareTo(TestMaximum.num3) == 1)
		{
			System.out.println("Maximum integer is = " + TestMaximum.num2 );
		}
		else
		{
			System.out.println("Maximum integer is = " + TestMaximum.num3 );
		}
	
	}
	public static void main(String[] args) {
		integerForTestMaximum();
		calculatingMaximumInt(TestMaximum.num1,TestMaximum.num2,TestMaximum.num3);
		FloatForTestMaximum.floatForTestMaximum();
		FloatForTestMaximum.calculatingMaximumFloat();
		StringforTestMaximum.stringforTestMaximum();
		StringforTestMaximum.calculatingMaximumInt();
	}
}
