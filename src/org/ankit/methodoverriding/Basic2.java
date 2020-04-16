package org.ankit.methodoverriding;

//Dynamic Method Patch Example  


class ABC{
   public void disp()
   {
	System.out.println("disp() method of parent class");
   }	   
}
class Basic2 extends ABC{
   public void disp(){
	System.out.println("disp() method of Child class");
   }
   public void newMethod(){
	System.out.println("new method of child class");
   }
   
   
   
   public static void main( String args[]) {

	ABC obj = new ABC(); 
	obj.disp();

	ABC obj2 = new Basic2(); // This is called dynamic method dispatch and runtime polymorphism
	obj2.disp();
   }
}