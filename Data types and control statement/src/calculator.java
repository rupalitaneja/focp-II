/*Write a program that takes two integers 
(values to be given within the program) and displays the output of the following operators
: addition, subtraction, multiplication, division and modulus. */ 
class calculator{
	public static void main(String args[]) 
	{
	int a=10,b=35;
	int sum=a+b;
	int difference=a-b;
	int product=a*b;
	int quotient=a/b;
	int remainder=a%b;
	System.out.print("\nthe sum of numbers is:"+sum);
	System.out.print("\nthe difference of nubmber is:"+difference);
	System.out.print("\nthe product of number is:"+product);
	System.out.print("\nthe quotient of number is:"+quotient);
	System.out.print("\nthe remainder of number is:"+remainder);
	}
}