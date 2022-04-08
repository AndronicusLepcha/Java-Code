import java.util.*;

class Stack{
	int top,n;     //declaring a variable that points to the top of the stack
	int arr[]=new int[5];   //declaing an array to for stack implemetation

	Stack(){
		top = -1;  		//top is alaways pointing to -1
	}
	void push(){
		if(top==4){
			System.out.println("Stack is Full");
		}
		else{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to enter in the stack!\n");
		int num=sc.nextInt();
		top=top+1;
		arr[top]=num;
		}
	}
	void pop(){
		if(top==-1){
			System.out.println("The Stack is Empty");
			}
		else{	
		System.out.println("The poped element is\n"+arr[top]);
		top--;
		}
	}
	void display(){
		if(top==-1){System.out.println("Stack is Empty");}
		else{
			for(int i=top;i>=0;i--){
			System.out.println("the elements in the array are:\n"+arr[i]);
				}

			}
		}

}
class StackImplementation
{

	public static void main(String args[]){
		//Creating the object of the class stack
		Stack obj=new Stack();
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("Please enter your choice\n1.PUSH elements \n2.POP elements \n3.DISPLAY elements \n4.Exit");
			int c=s.nextInt();
			switch(c){
					case 1:obj.push();
						break;
					case 2:obj.pop();
						break;
					case 3:obj.display();
						break;
					case 4:return;
					default: System.out.println("Please enter a valid choice");	
				}
			}
		}

}


