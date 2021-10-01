package com.TT.java;

public class Class_2_If_Else_Statement {

	public static void main(String[] args) {
		// If Else Statement
		int age = 110;
		if (age < 13) {
			System.out.println("you are children");
		} else if (age > 13 && age < 18) {
			System.out.println("you are teenager");
		} else if (age > 60) {
			// Nested If Else Statement
			if (age > 100) {
				System.out.println("You are Hero");
			} else {
				System.out.println("You are Senior");
			}
		} else {
			System.out.println("You are adult");
		}
	}
}
