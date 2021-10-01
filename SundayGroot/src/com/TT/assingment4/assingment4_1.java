package com.TT.assingment4;

import assingment4_1;

		/*1. Write a USER PROGRAM using encapsulation that contains the username, password,
		email, first and last names of a user of our application. Display the user
		information in console output. */

		public class assingment4_1 {

			private String username;
			private int password;
			private String email;
			private String fname;
			private String lname;
			
			public void setUsername(String value){  
			username = value;
			}
			public void setPassword(int value){
			password = value;
			}
			public void setEmail(String value){  
			email = value;
			}
			public void setFname(String value){
			fname = value;
			}
			public void setLname(String value){
			lname = value;
			}
			
			//Getter method used to get the value
			
			public String getUsername(){
				return username;
			}	
			public int getPassword(){
				return password;
			}
			public String getEmail(){
				return email;
			}	
			public String getFname(){
				return fname;
			}
			public String getLname(){
				return lname;
			}


			
			public static void main(String[] args) {
				assingment4_1 obj = new assingment4_1();
			obj.setUsername("Johnny");;
			obj.setPassword(344567);
			obj.setEmail("hotmail.com"); // not working only three options only ssn user pw
			obj.setFname("Mike");
			obj.setLname("Sam");
			System.out.println(obj.getUsername());
			System.out.println(obj.getPassword());
			System.out.println(obj.getEmail());
			System.out.println(obj.getFname());
			System.out.println(obj.getLname());
			
			
			}

	}
	


