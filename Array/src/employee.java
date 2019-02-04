import java.util.*;
class employee{
	String firstName;
	String lastName;
	double salary;
	employee(String fn, String ln, double d){
	firstName=fn;
	lastName=ln;
	salary=d;
	}
	double yr_sal(){
	       return salary*12;
	       }
    void salRaise(){
	       salary=salary*0.1;
	       }
    void displayEmp(){
             System.out.println("First name:"+firstName);
             System.out.println("Second Name:"+lastName);
             System.out.println("Salary"+salary);
             }
	       }
	       class emp_main{
           public static void main(String args[])                         
           { 
           Scanner in=new Scanner(System.in);
           String f,l;
           double s;
           System.out.print("first name:");
           f=in.next();
           System.out.print("Enter last name:");
           l=in.next();
           System.out.print("enter salary:");
           do{
           s=in.nextDouble();
           if(s<0){ 
           System.out.println("Salary is a positive quantity,please enter again..");
           }
           }while(s<0);
            employee e1=new employee(f,l,s);
            e1.displayEmp();
          
            System.out.println(e1.yr_sal());
             }
	       }