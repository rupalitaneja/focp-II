//2.	Write a Java program that takes a number from the user between 1 and 12 and displays the name of the corresponding month until the user wants to exit the program
import java.util.Scanner;
public class Month 
{
public static void main(String args[]) 
{
 Scanner mon = new Scanner(System.in);
 int monthNumber;
 do{
  
System.out.print("Enter month's number: ");


monthNumber = mon.nextInt();
System.out.println("Enter again to continue or Enter '13' to exit..");
 switch (monthNumber) {
 case 1:
 System.out.println("January.");
break;
case 2:
System.out.println("February.");
break;
 case 3:
 System.out.println("March.");
 break;
case 4:
 System.out.println("April.");
 break;
case 5:
System.out.println("May.");
break;
case 6:
System.out.println("June.");
break;
case 7:
System.out.println("July.");
 break;
case 8:
System.out.println("August.");
break;
case 9:
System.out.println("September.");
break;
case 10:
System.out.println("October.");
 break;
case 11:
System.out.println("November.");
break;
case 12:
System.out.println("December.");
break;
case 13:
System.out.println("Enter 13 to exit..");
break;
default:
System.out.println("Invalid month.");
break;
} 
}while(monthNumber!=13);
}
}