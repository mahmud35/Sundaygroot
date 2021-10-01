package com.TT.java;

import java.util.HashMap; //java 8 v16

public class Class_4_Array_Hasmap {

	public static void main(String[] args) {
		// Array Store multipul data using array index 

	//	int age = 30;					// old way you can only enter one data varible at a time
		
	//	int[] ageGroupA = new int[]{25, 35, 32, 38, 40, 50};  // you can enter as many varible as you want
		
		float age = 30;					//why asking for us to use double  // use f for float
		
		float[] ageGroupA = new float[]{2.5f, 35.3f, 32.3f, 38.3f, 40.3f, 50.3f};  
		
			// Array Index				  	0	1	2	3	4	5		6	need to begin with 0
	
		
		System.out.println("Group A Student Age = " + ageGroupA[3]);	// in order to print we need [] enter array index number
																		// to print
		
		System.out.println("Array Length of AgeGroupA = " + ageGroupA.length); // Array Length
																			   // instead count how many varibles
																			   // there is you can use length to count for you.
	
		String name = "Sadia";

		String[] nameGroupA = new String[]{"David","Akon","Sarwar","Shahid","Afsana","Sadia"};
		// Array Index				 		  0		 1		 2		  3			4		5			need to begin with 0
		 
		System.out.println("Group A Name = " + nameGroupA[3]);	// in order to print we need [] enter array index number
																// to print
		
		// Multi-dimensional Array
		//int[][] Area = {
		//		{25, 35, 32, 38, 40, 50},
		//		{32, 24, 12, 6}};
				
		//for (int i = 0; i <Area.length; i++){
		//	for (int j = 0; j <Area[i].length; j++){
		//		System.out.println("Value of Area " + Area[i][j]);
		
		int[][] D = {
				          {25,     35,    32,    38,    40,   50},	
				// 0	//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
				          
				{           32,     24,   12,   6},             
				// 1	//[1][0] [1][1] [1][2] [1][3]
				
							{22,		23},	
					// 2   [2][0]      [2][1]
								{34}};           			
						   // 3 [3][0]
		
		System.out.println("Value of Multi-dimensional Array " + D[3][0]);
		
		

		// Hashmap store multi data using key-value pair
		
				HashMap<Integer, String> StudentAge = new HashMap<Integer, String>();
				
				StudentAge.put(23, "David");
				//StudentAge.put("New", 54);
				//StudentAge.put("Akon", 32);
				
				System.out.println("Hashmap Value :" + StudentAge.get(23) );
				
				HashMap<String, String> CapitalCity = new HashMap<String, String>();
				
				CapitalCity.put("USA", "WashingtonDC");
				CapitalCity.put("China","Beijing");
				
				System.out.println("Hashmap Capital :" + CapitalCity.get("USA") );
						
						}
				}
	
