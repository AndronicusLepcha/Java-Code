import java.util.*;
class A{ 
	int i,j;
        void showij(){ 
                        System.out.println("the value for i and j ="+i+""+j);
                    }
}
class B extends A{ 
		int k;
        void showk(){ 
                     
                        System.out.println("the value for k"+k);
                    }
	void sum(){
		System.out.println("the sum of i, j and k is"+(i+j+k));
		}
}

class SingleInheritance{
		public static void main (String args[]){
		A superOb  = new A();
		B subOb  = new B();
		superOb.i=10;
		superOb.j=20;
		superOb.showij();
		//initalizing class B data mambers in which i and j are inherited.
		subOb.i=2;
		subOb.j=3;
		subOb.k=4;
		subOb.showij();
		subOb.showk();
		subOb.sum();
		}
	}

