import java.util.*;
 class mainstack{
 public static void main(String args[]){
Scanner in=new Scanner(System.in);	
int z,c;
stack s1=new stack();

do
{
System.out.println("Enter 1 to push for insertion \n 2. for pop for Deletion \n 3. for checking empty status \n 4. for checking Full status \n 5. for checking Space Left \n 6 to exit");
System.out.println("ENTER YOUR CHOICE:");
c = in.nextInt();
switch(c)
{
	case 1:
	System.out.println("Enter a new value:");
	z=in.nextInt();
	s1.push(z);
	break;

	case 2:
	s1.pop();
	break;

	case 3:
	System.out.println(s1.isEmpty());
	break;

	case 4:
	System.out.println(s1.isFull());
	break;

	case 5:
	System.out.println(s1.spaceLeft());
	break;

	case 6:
	System.out.println(" Enter '6' to exit");
	break;

    default:
	 System.out.println("Enter the correct choice....");
	}
	
}while(c!=6);


}
}