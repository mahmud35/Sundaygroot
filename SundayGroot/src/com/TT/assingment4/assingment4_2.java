package com.TT.assingment4;

// Java program to ReverseString using StringBuilder

        import java.lang.*;				// WHY SO MANY IMPORT LINE 6 7 8 
		import java.io.*;
		import java.util.*;
		 
		// Class of ReverseString
		public class assingment4_2 { 
		    public static void main(String[] args)
		    {
		        String input = "";
		        System.out.println("Before Reverse String: " + input);
		        StringBuilder input1 = new StringBuilder();    // why we need this Make new obj?
		 
		        // append a string into StringBuilder input1
		        input1.append(input);
		 
		        // reverse StringBuilder input1
		        input1.reverse();
		 
		        // print reversed String
		        System.out.println("After Reverse String: " + input1);
	}

	}
