package com.TT.assingment2;

public class assingment2_7 {

	public static void main(String[] args) {
		// 7. You are given two integer number (a=25, b=30), write a program to
				// swap them and display result on the screen.
				
				swap();
			}
			public static void swap() {
				int a = 25; 
				int b = 30;
				int c; 
				
				System.out.println("Before Swapping");
				System.out.println("a = " + a + " b = " + b);
				
				c = a;
				a = b;
				b = c;
				
				System.out.println("After Swapping");
				System.out.println("a = " + a + " b = " + b);
			
			}

		}


