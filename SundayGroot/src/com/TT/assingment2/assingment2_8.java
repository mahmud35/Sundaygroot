package com.TT.assingment2;

public class assingment2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8.	Write Java Program to display Factorial of Number 7.
		

        int num = 7;
        int factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
   
    }

}
	


