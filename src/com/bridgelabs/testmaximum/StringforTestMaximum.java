package com.bridgelabs.testmaximum;

import java.util.Scanner;

import com.bridgelabs.testmaximum.TestMaximum.TestMaximumFloat.TestMaximumString;

public class StringforTestMaximum {

	static Scanner sc = new Scanner(System.in); 
	
	static void stringforTestMaximum() {
		System.out.println("Enter first String = ");
		TestMaximumString.name1 = sc.next();
		System.out.println("Enter second String = ");
		TestMaximumString.name2 = sc.next();
		System.out.println("Enter third String = ");
		TestMaximumString.name3 = sc.next();
		
	}
	
	static  void calculatingMaximumInt() {
		if((TestMaximumString.name1).compareTo(TestMaximumString.name2) == 1 && (TestMaximumString.name1).compareTo(TestMaximumString.name3) == 1)
			{
				System.out.println("Maximum integer is = " + TestMaximumString.name1 );
			}
		else if((TestMaximumString.name2).compareTo(TestMaximumString.name1) == 1 && (TestMaximumString.name2).compareTo(TestMaximumString.name3) == 1)
		{
			System.out.println("Maximum integer is = " + TestMaximumString.name2 );
		}
		else
		{
			System.out.println("Maximum integer is = " + TestMaximumString.name3 );
		}
	
	}

}
