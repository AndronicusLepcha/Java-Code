import java.util.*;
class Exception{
		public static void main(String args[]){
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the Dividend");
			int x=in.nextInt();
			System.out.println("Enter the Divisor");
			int y=in.nextInt();


			try{
				int z=x/y;
				System.out.println("Result="+z);
			}catch(ArithmeticException e){
				System.out.println("Divison by 0 not possible");
			}


			System.out.println("Please execute me!!!");
		}	
}
