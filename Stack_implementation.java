import java.util.*;

class stack{
	int arr,top;
	stack(int size){
		arr = new int[size];
		top = -1;
			}
	
	void push(int x){
		if(top=size-1){
				System.out.println("Stack is full");
			}
		else{
			arr[top]=x;
			top++;
			}
		}	
}
class Stack_implementation{
			public static void main(String args[]){
								System.out.println("Implementing the Stack Concept in Java!!");
								stack obj=new stack(5);
								obj.push();
								}
}
