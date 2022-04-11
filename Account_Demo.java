import java.util.*;
abstract class Account{
		int acc_no,acc_bal,total_cus;
		int total_trans=0;
		String cust_name,acc_type;

		void get_data(){
			Scanner s=new Scanner(System.in);
			Scanner in=new Scanner(System.in);
			System.out.println("\n\t Hello");
			System.out.println("\nPlease enter you name?");
			cust_name=s.nextLine();
			System.out.println("\nEnter the customer number:");
			total_cus=in.nextInt();
			System.out.println("\nEnter you account Number:");
			acc_no=in.nextInt();
		//	System.out.println("\nEnter your account type \n1 for Saving \n 2 for Current");
			
		//	System.out.println("\nChoose which type of account:\n1.Saving Account\n2.Current Account\n");
		//	int ch=s.nextLine();
		//	while()
		}
		void withdraw(){
			Scanner s=new Scanner(System.in);
			if(acc_bal==0){
				System.out.println("\nYour account has 0 balance!!\n");
				}
			else{
				System.out.println("\nEnter the ammount to withdraw\n");
				int w=s.nextInt();
				if(w>acc_bal){
						System.out.println("\nInsufficent Balance!!\n");
						}
				else{
				//System.out.println("Rs"+w+"Has beed withdraw");
				acc_bal = acc_bal-w;
				System.out.println("\nRs."+ w +" has been withdraw sucessfully\n");
				total_trans++;
				}
			}

		}
		void deposit(){
			Scanner s=new Scanner(System.in);
			System.out.println("\nEnter the amount you want to deposit\n");
			int d=s.nextInt();
			System.out.println("\nDeposited:"+d+"\n");
			acc_bal=acc_bal+d;
			total_trans++;
		}
		void display(){
			System.out.println("\nName:"+cust_name);
			System.out.println("\nAccount Number"+acc_no);
			System.out.println("\nTotal customer"+total_cus);
			System.out.println("\nTotal no of transaction="+total_trans);
			System.out.println("\nYou total balance="+acc_bal);
		}

		abstract void disp();
//		abstract void show();		

}
class S_Account extends Account{
		//super.get_data();
		int s_total_trans=0;
		S_Account(){
			s_total_trans++;
		}
		public void disp(){
			super.display();
		}
}

class C_Account extends Account{
		int c_total_tans;
		C_Account(){
			c_total_tans++;
		}
		public void disp(){
		super.display();
		}
}

class Account_Demo{
	public static void main(String args[]){
		Scanner c=new Scanner(System.in);
		S_Account sob=new S_Account();
		C_Account cob=new C_Account();
		System.out.println("\t**HELLO WELCOME TO E-BANKING**");
		System.out.println("Please choose the account type:\n1.Current Type\n2.Saving Type\n3.Exit");
		int ch=c.nextInt();
		
		switch(ch){
			case 1:cob.get_data();
				while(ch != 3){
					System.out.println("Choose the options\n1.Show my details\n2.Deposit\n3.Withdraw\n4.Exit");
					int cch=c.nextInt();
						switch(cch){
							case 1:System.out.println("\nAccount type: CURRENT\n");
								cob.disp();
								break;
							case 2:cob.deposit();
								break;
							case 3: cob.withdraw();
								break;
							case 4: return;

							default: System.out.println("Please re-enter your choice!");
							break;
							}
						}
			break;

			case 2: sob.get_data();
				while(ch != 3){

					System.out.println("Choose the options\n1.Show accounts details.\n2.Deposit\n3.Withdraw\n4.Exit");
					int cch=c.nextInt();
					switch(cch){
							case 1:System.out.println("\nAccount type: SAVING\n");
							sob.disp();
							break;
							case 2:sob.deposit();
							break;
							case 3:sob.withdraw();
							break;
							case 4:return;
							default:System.out.println("Please re-enter you choice!");
							break;
						}
					}
			break;
			case 3:System.out.println("\nExited");
			return;
			default:System.out.println("Please enter a valid choice!");
			break;
				}
		}
}

