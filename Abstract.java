#Abstract
import java.util.*;
abstract class A{
	abstract void display();
	 void show(){
		System.out.println("This is inside the abstract class A");
		}	
	}

class B  extends A{
		void display(){
		System.out.println("I am defining the abstract method in Sub class B");
		
		}
}

class Abstract{
	public static void main(String args[]){
		//	A a=new A();  This is not allowed or we cannot create the object of the abstract class
			B b=new B();
			b.display();
			b.show();
		}
}
