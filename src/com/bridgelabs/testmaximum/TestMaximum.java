package com.bridgelabs.testmaximum;
public class TestMaximum < T extends Comparable < T >> {
			T firstValue, secondValue, thirdValue;

		
	   static < T extends Comparable < T >> T testMaximum(T subfirstValue, T subsecondValue, T subthirdValue) {
		   	T max;
	        if(subfirstValue.compareTo(subsecondValue)>0 && subfirstValue.compareTo(subthirdValue)>0) {
		             
		            max = subfirstValue;
		            printMax(subfirstValue,subsecondValue,subthirdValue,max);
		        }
		    else if(subsecondValue.compareTo(subfirstValue)>0 && subsecondValue.compareTo(subthirdValue)>0) {
		            
		            max = subsecondValue;
		            printMax(subfirstValue,subsecondValue,subthirdValue,max);
		        }
		    else {
		       
		            max = subthirdValue;
		            printMax(subfirstValue,subsecondValue,subthirdValue,max);
		        }
	        return max;
		    }
	   static < T  extends Comparable <T>> void printMax(T printFirstValue,T printSecondValue,T printThirdValue,T subMax) {
		   System.out.println("Maximum value is " + subMax + " among " + printFirstValue + " , " + printSecondValue + " , " + 
				   				printThirdValue);
	   }
	   

	public static void main(String[] args) {

		System.out.println("Integer value Passed = 65,49,12");
		testMaximum(65,49,12);
		System.out.println("Float Passed = 15.25,35.25,15.65");
		testMaximum(15.25,35.25,15.65);
		System.out.println("String Passed = Jackfruit,orange,Pineapple ");
		testMaximum("Jackfruit","orange","Pineapple");
	}
}
