/*5.	Write a Java program that asks the user to provide a 
single character from 	the alphabet. Print Vowel or Consonant, 
depending on the user input. If the user input is not a letter (between a and z or A and Z)
, or is a string of length > 1, print an error message*/

import java.util.*;
class alphabet{
	public static void main(String[] args)
	{
	Scanner r= new Scanner(System.in);
	System.out.println("enter a character");
	char ch=r.next().charAt(0);
	if( (ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u') )
	System.out.println("the character is a vowel...");
	else if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z'))
	System.out.println("the charcater is an alphabet");
 else
System.out.println("the character is not an alphabet");
 }
}