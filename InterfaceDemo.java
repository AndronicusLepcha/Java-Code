interface MyInterface{
	int x=10;
	void show();
	}
interface MyInterface2 extends MyInterface{
	int y=90;
	void disp();
	}

class A implements MyInterface2{
		public void show(){
				System.out.println("Inside Show\n");
				System.out.println("x="+x);
		
			}
		public void disp(){
				System.out.println("Inside Display\n");
				System.out.println("y="+y);
			}
		public void compute(){
				int sum=x+y;
				System.out.println("Sum ="+sum);
			}
	
	}

class InterfaceDemo{
		public static void main(String args[]){
				A oba=new A();
				oba.show();
				oba.disp();
				oba.compute();
				}
		}
