package org.ankit.methodoverloading;

class TypePromotion{
   void disp(int a, double b){
	System.out.println("Method A");
   }
   void disp(int a, double b, double c){
	System.out.println("Method B");
   }
   public static void main(String args[]){
	TypePromotion obj = new TypePromotion();

	obj.disp(100, 20.67f); // The result would be Method A(first method( because there wasn't any method having arg list as (int, float) and i gave the float value. 
   }
}