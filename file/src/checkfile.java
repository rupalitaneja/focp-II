//to find the length of a file
import java.io.*;
class checkfile{
	public static void main(String args[]){
	try{
	File f=new File("abc.java");
	System.out.println(f.length());

	}
	catch(Exception e){
	System.out.println(e);
	}
	}
}