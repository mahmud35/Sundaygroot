package com.TT.assingment2;

public class assingment2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. Write a program in Java to display the multiplication table of (eight)8.
		 
		multiplicationTable();
		}
		public static void multiplicationTable(){
		for (int row =1; row <= 8; row++) {
			for (int col =1; col <=10; col++){
			 int multipicationTable = row * col;
			System.out.println(multipicationTable + "");
			}
			
		}
		}

}

