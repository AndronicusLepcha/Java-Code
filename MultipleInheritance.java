import java.util.*;
interface Show{
	 void show();
}

interface Print{
	 void print();
}

class A implements Show,Print{
		public void show(){
			System.out.println("this is inherited from show interface");
		}
		public void print(){
			System.out.println("this is inherited from print interface");	
		}
		
}

class MultipleInheritance{
	public static void main(String args[]){
		A aob=new A();
		aob.show();
		aob.print();
	}
}
