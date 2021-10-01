package com.TT.assingment1;

public class assingment1_2 {

	/*Problem 02: A rectangle width and length are: 9 and 13 inches.
	Write a method to display the perimeter of rectangle in console output. */

		public static void main(String[] args) {
			rectangleParameter();
		}

		public static void rectangleParameter() {
			int a = 9;
			int b = 13;
			int perimeter = 2 * (a + b);
			System.out.println("The Perimeter of the rectangle = " + perimeter);
		}

	}
