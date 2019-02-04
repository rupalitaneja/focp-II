//read and write in a file
import java.io.*;
import java.util.*;
class prog1
{
	public static void main(String args[])
	{
	int sno;
	String firstname;
	char grade;
	File f=null;
	try
	{
	f=new File("file.txt");
	FileWriter fout=new FileWriter(f);
	BufferedWriter bout=new BufferedWriter(fout);
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a SNO.");
	sno=sc.nextInt();
	bout.write(sno+" ");
     System.out.println("enter first name");
	firstname=sc.next();
	bout.write(firstname+" ");
	System.out.println("enter cgpa");
	double cgpa=sc.nextDouble();
	bout.write(cgpa+" ");
	System.out.println("enter grade");
	grade=sc.next().charAt(0);
	bout.write(grade+" ");
		
	bout.close();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	try{
    f= new File("file.txt");
	FileReader fin=new FileReader(f);
	BufferedReader bin=new BufferedReader(fin);
	String sr;
	System.out.println("The contents of the file are:");
	while((sr=bin.readLine())!=null){
	System.out.println(sr);
	}
	}

	catch(Exception e){
	e.printStackTrace();
	}
}
}