  //Method Overriding
	//if subclass (child class) has the same method as declared in parent class it is known as method overriding
import java.util.*;
class A{
	void show(){
       	System.out.println("\n This is the method of Class A");
	}	
	
}
class B extends A{

		void show(){
		System.out.println("\nThis is the method of class B ");
		}			
}
class C extends  B{
		void show(){
		System.out.println("\nThis is the method of class C");
		}	
}

class Overriding{
	public static void main(String args[]){
			A aob = new A();
			B bob = new B();
			C cob = new C();
			cob.show();
			}
}
