package com.bridgelabs.testmaximum;

import java.util.Scanner;

import com.bridgelabs.testmaximum.TestMaximum.TestMaximumFloat;

public class FloatForTestMaximum {
	static Scanner sc = new Scanner(System.in); 
	
	static void floatForTestMaximum() {
		System.out.println("Enter first number = ");
		TestMaximumFloat.numF1 = sc.nextFloat();
		System.out.println("Enter second number = ");
		TestMaximumFloat.numF2 = sc.nextFloat();
		System.out.println("Enter third number = ");
		TestMaximumFloat.numF3 = sc.nextFloat();
		
	}
	
	static  void calculatingMaximumFloat() {
		if((TestMaximumFloat.numF1).compareTo(TestMaximumFloat.numF2) == 1 && (TestMaximumFloat.numF1).compareTo(TestMaximumFloat.numF3) == 1)
			{
				System.out.println("Maximum integer is = " + TestMaximumFloat.numF1 );
			}
		else if((TestMaximumFloat.numF2).compareTo(TestMaximumFloat.numF1) == 1 && (TestMaximumFloat.numF2).compareTo(TestMaximumFloat.numF3) == 1)
		{
			System.out.println("Maximum integer is = " + TestMaximumFloat.numF2 );
		}
		else
		{
			System.out.println("Maximum integer is = " + TestMaximumFloat.numF3 );
		}
	
	}
}


