package com.TT.java;


public class Class_1_MethodType_Object {

	/* 	Types of Methods
	  	1.Void Method
	   	2.Static Method
	   	3.Return Type Method   */
	
	static int hourlyIncome = 75; //Manual QA = 40-60$, Automation QA = 50-70$, SDET =60-80$
	
	public static void main(String[] args) {
		//Void Method		
		// annualIncome();													can not just call method in main method annualIncome(); 									
		Class_1_MethodType_Object myobj = new Class_1_MethodType_Object();		//Create Class Object to call it: Classname myObj = new Classname
		myobj.annualIncomeVoid();												//Calling Void Method ;myObj
		
		//Static Method
		weeklyIncomeStatic();													//Calling Static Method // can call directly in the main method
																				// dont need to create the object
																				// Static method hold the data in the memories of this class

		//Return Type Method
		System.out.println("My Monthly Income = " + myobj.monthlyIncomeReturn()); //Calling Return Type Method using object add"myobj.
	}

	//Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	//Static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	
	//Return Type Method								// can be static and nonstatic   do the work but have to return a varible 
	public int monthlyIncomeReturn(){					// need to add myonj. to print in the main method
	//public static int monthlyIncomeReturn(){			//dont need to add myobj. to print 
		int calculateMonthlyIncome = hourlyIncome * 180;
	//	System.out.println("My Weekly Income = " + calculateMonthlyIncome); since its return type cant printout here 
		return calculateMonthlyIncome;						// need to call in the main method to printout
	}
	
	public static String name(){
		String name = "Rayhan";
		return name;
	}
}