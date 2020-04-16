package org.ankit.methodoverriding;

// This is an example of Super Keyword

class ABCD{
   public void myMethod()
   {
	System.out.println("Overridden method");
   }	   
}


class Super extends ABCD
{
   public void myMethod()
   {
	super.myMethod();  						//This will call the myMethod() of parent class
	System.out.println("Overriding method");
   }
   
   
   public static void main( String args[])
   {
	Super obj = new Super();
	obj.myMethod();
   }
}