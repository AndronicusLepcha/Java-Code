/*
//create Package as follows:

package Mypackage;

public class PackA{
        public void show(){
        System.out.println("\nThis is the Package of PackA Class!");
        }
}
package Mypackage;

public class PackB{
        public void show(){
        System.out.println("\nThis is the Package of PackB Class!");
        }
}

package Mypackage;

public class PackC{
        public void show(){
        System.out.println("\nThis is the Package of PackC Class!");
        }
}

/*Now first compile your pacakge by  javac -d . package_name
One dir will be created as Mypackage;
move to Mypackage dir and ls
you can see the different class file there
And Then Execute the following the code*/


*/





import Mypackage.PackA;
import Mypackage.PackB;
import Mypackage.PackC;
class PackageTest{
	public static void main(String args[]){
			PackA aob=new PackA();
			PackB bob=new PackB();
			PackC cob=new PackC();
			aob.show();
			bob.show();
			cob.show();
		}
}
