package com.TT.assingment2;

public class assingment2_3 {

	public static void main(String[] args) {
		//* 3. Write two java functions which will return two different integer
				// * values, write a program to compare those numbers and send message
				// * that one number is bigger than other. (hints: using if..else)
				// */
				compareNumbers();
			}

			public static int myFunction1() {
				int a = 20;
				return a;
			}

			public static int myFunction2() {
				int b = 30;
				return b;
			}

			public static void compareNumbers() {
				if (myFunction1() > myFunction2()) {
					System.out.println("1st Function Is Bigger Then 2nd Function");
				} else {
					System.out.println("2nd Function Is Bigger Then 1st Function");
				}
			}

			}
	


