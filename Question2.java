import java.util.*;

class account{
    static int acc_no, total_cust;
    static String cust_name;
    String acc_typ;
    float acc_bal=0;
    boolean flag=true;
    static int total_transac=0;
    void get_data(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name:");
        cust_name=sc.nextLine();
        System.out.println("Enter account number:");
        acc_no=sc.nextInt();
        System.out.println("Enter customer number:");
        total_cust=sc.nextInt();
    }
    void withdraw(){
        Scanner sc=new Scanner(System.in);
        if (acc_bal==0){
            System.out.println("Account Empty");
            return;
        }
        else{
            System.out.println("Enter amount to withdraw");
            int n=sc.nextInt();
            if(n>acc_bal){
                System.out.println("Insuffecient Funds");
                return;
            }
            System.out.println(n+ " withdrawn");
            acc_bal-=n;
            total_transac++;
            flag=false;
            if(acc_bal==0)
                flag=true;
        }
    }
    void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to deposit");
        int n=sc.nextInt();
        System.out.println(n+" Deposited");
        acc_bal=n+acc_bal;
        total_transac++;
    }
    void display(){
        System.out.println("Total transac: "+total_transac);
    }
}

class S_account extends account{
    int S_total_transac=0;
    void inc(){
        S_total_transac++;
    }
    void display(){
        System.out.println("\nAccount No: "+acc_no);
        System.out.println("Total Customer: "+total_cust);
        System.out.println("Total balannce: "+acc_bal);
        super.display();
        System.out.println("Total transactions in Savings account: "+S_total_transac+"\n");
    }
}

class C_account extends account{
    int C_total_transac=0;
    void inc(){
        C_total_transac++;
    }
    void display(){
        System.out.println("\nAccount No: "+acc_no);
        System.out.println("Total Customer: "+total_cust);
        System.out.println("Total balannce: "+acc_bal);
        super.display();
        System.out.println("Total transactions in Current account: "+C_total_transac+"\n");
    }
}
class Question2 {
    public static void main(String[] args) {
        int s, c;
        Scanner sc=new Scanner(System.in);
        S_account Sobj=new S_account();
        C_account Cobj=new C_account();
        Sobj.get_data();
        while (true) {
            System.out.println("Enter:\n1 to select Savings Account\n2 to select Current Account\n3 to stop\n");
            c=sc.nextInt();
            switch(c){
                case 1:
                while(c!=4){
                    System.out.println("Enter:\n1 to withdraw\n2 to deposit\n3 to display balance\n4 to choose again\n5 to exit\n");
                    s=sc.nextInt();
                    switch (s) {
                        case 1: Sobj.withdraw();
                            if(Sobj.flag){
                                break;
                            }
                            else{
                                Sobj.inc();
                                break;
                            }
                        case 2: Sobj.deposit();
                            Sobj.inc();
                            break;
                        case 3: Sobj.display();
                            break;
                        case 4: c=4;
                            break;
                        case 5: return;
                        default: System.out.println("Invalid choice");
                            break;
                    }
                }
                break;
                case 2:
                while(c!=4){
                    System.out.println("Enter:\n1 to withdraw\n2 to deposit\n3 to display balance\n4 to choose again\n5 to exit");
                    s=sc.nextInt();
                    switch (s) {
                        case 1: Cobj.withdraw();
                            if(Cobj.flag){
                                break;
                            }
                            else{
                                Cobj.inc();
                                break;
                            }
                        case 2: Cobj.deposit();
                            Cobj.inc();
                            break;
                        case 3: Cobj.display();
                            break;
                        case 4: c=4;
                        break;
                        case 5: return;
                        default: System.out.println("Invalid choice");
                            break;
                        }
        
                    }
                    break;
                case 3: return;
            }     
        }
    }
}
