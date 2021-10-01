package com.TT.java;

public abstract class Class1_access_modifiers_datatypes_variable {

	
			//Access Modifiers
			public int age = 35;      			   	     // access any other class everywhere	
			private String car = "BMW";				     // only access in this class only
			protected boolean isNice = true;			// access by classes in the same package and subclasses 
			int sum = 50;								// default 
			
			//Non-Access Modifiers
			static String city = "NYC";					// the value will store in the class
			final String city2 = "Buffelo";				// 
			abstract void district(); 
			
			
			public static void myMethod(String color, int door){
				int doorEstimate = door + 2;
				System.out.println("car door : " + doorEstimate);
				System.out.println("Car Color : " + color);
			}
			
			public static void main(String[] args) {
				myMethod("Green", 2);
				myMethod("Blue", 4);
				myMethod("Red", 6);
			}
		}

