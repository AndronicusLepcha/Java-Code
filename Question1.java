import java.util.*;
class Student{
	String name,dept;
	int roll,marks1,marks2;
}

class Marks extends Student{
	Scanner In=new Scanner(System.in);//For the user input
	void get_details(){
		System.out.println("\nEnter the name of the Student\t");
		name=In.nextLine();
		System.out.println("\nEnter the Department\t");
		dept=In.nextLine();
		System.out.println("\nEnter the Rollno\t");
		roll=In.nextInt();
		System.out.println("\n Enter the Marks1\t");
		marks1=In.nextInt();
		System.out.println("\nEnter the Marks2\t");
		marks2=In.nextInt();
	}

	void put_details(){
		System.out.println("\n \t****Student Details***\t");
		System.out.println("\nName=\t"+name);
		System.out.println("\nDepartment=\t"+dept);
		System.out.println("\nRollno=\t"+roll);
		System.out.println("\nMarks1=\t"+marks1);
		System.out.println("\nMarks2=\t"+marks2);
	}	
}

interface Sports{
	String sport_wt="CRICKET IS A GOOD GAME";
	void sport_wt();	
}

class Result extends Marks implements Sports{
		public void sport_wt(){
			System.out.println(sport_wt);
		}
		void total_marks(){
			int total;
			total=marks1+marks2;
			System.out.println("\nTotal Marks"+total);
		}
}


class Question1{
	public static void main(String args[]){
			Result obj = new Result();
			obj.get_details();
			obj.put_details();
			obj.sport_wt();
			obj.total_marks();
		}
}
