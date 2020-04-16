package org.ankit.methodoverriding;

//Basic Method Overriding

class Human{
  
   public void eat()
   {
      System.out.println("Human is eating");
   }
}
class Basic extends Human{

   public void eat()
   {
      System.out.println("Boy is eating");
   }
   public static void main( String args[]) 
   
   {
      Basic obj = new Basic();
      obj.eat();
   }
}
