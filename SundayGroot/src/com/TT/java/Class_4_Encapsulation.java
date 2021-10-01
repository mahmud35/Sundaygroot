package com.TT.java;

public class Class_4_Encapsulation {

	
		// Encapsulation used to hide the data using setter and getter method
		
		private int ssn;
		private int password;
		private String username;
	//	write only
		//Where Type// Setter method used to set the value
		
		public void setSSN(int value){
		ssn = value;
		}
		public void setPassword(int value){
		password = value;
		}
		public void setUsername(String value){     // why not all private instead public
		username = value;
		}
		//Getter method used to get the value
		//read only
		public int getSSN(){
			return ssn;
		}
		public int getPassword(){
			return password;
		}
		public String getUsername(){
			return username;
		}	
		//Class can have total control and variable can be read-only or write-only
		
		private String name = "Minions"; 
		private int age;
		
		public String getName(){  			//Read-only
			return name;
		}
		
		public void setAge(int value){		//Write-only
			age=value;
		}

		public static void main(String[] args) {
			Class_4_Encapsulation obj = new Class_4_Encapsulation();
			obj.setSSN(986672578);
			obj.setPassword(12345);
			obj.setUsername("Test");
			System.out.println(obj.getSSN());
			System.out.println(obj.getPassword());
			System.out.println(obj.getUsername());
			
			System.out.println(obj.getName());
			obj.setAge(25);
		}
	}
