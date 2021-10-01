package com.TT.assingment1;

public class assingment1_4 {

	// 4. A function returns 30, another function returns 50. Write a java
	// program which will display subtraction value from bigger number to
	// smaller. //

	public static void main(String[] args) {

		int c = functionB() - functionA();
		System.out.println("Function Smaller Number = " + c);
	}

	public static int functionA() {
		return 30;
	}

	public static int functionB() {
		return 50;
	}
}

