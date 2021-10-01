package com.TT.java;

public class Class_3_Polymorphism {


		/* Polymorphism is the ablility of an object to take on many forms.
		 * - Method Overloading (Compile time polymorphism/Static binding) same method name with different signature to overloading
		 * - Method Overriding (Runtime Polymorphism/Dynamic binding) same method name from parent class to override
		 */
		// Method Overloading
		
		public void car(){
			System.out.println("My car is BMW");
		}
		public void car(int door){
			System.out.println("My car is BMW, Door int = " + door);
		}
		public void car(String color){
			System.out.println("My car is BMW, Color string = " + color);
		}
		public void car(int door, int seat){
			System.out.println("My car is BMW, Door int = " + door + "Seat = " + seat);
				
			
	}	public static void main(String[] args) {
		Class_3_Polymorphism obj = new Class_3_Polymorphism();
		
		// Method Overloading 
		obj.car(2);
		obj.car();
		obj.car("black");
		obj.car(4,5);

		//Method overriding
		
		obj.vanFord();
}
	
	public void vanFord(){
		System.out.println("this is from method overriding");
	}
}

class Van {
	
	public void vanFord(){
		System.out.println("This is vanFord method from van class");
	}
}

