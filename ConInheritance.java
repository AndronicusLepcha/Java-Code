  //Method Overriding
	//if subclass (child class) has the same method as declared in parent class it is known as method overriding
import java.util.*;
class A{
	A(){
       	System.out.println("\n This is the constructor of Class A");
	}	
	
}
class B extends A{

		B(){
		System.out.println("\nThis is the contructor of class B ");
		}			
}
class C extends  B{
		C(){
		System.out.println("\nThis is the constructor of class C");
		}	
}

class ConInheritance{
	public static void main(String args[]){
			C cob =new C();
			
			}
}
