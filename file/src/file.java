import java.util.*;
import java.io.*;
class program{
	File f=null;
    void write(){
      try {
         f = new File("abc.txt");
         FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
 	     while(sc.hasNext()){
               bout.write(sc.nextLine());
               bout.newLine();    }
           }    
          catch (Exception e) {
         e.printStackTrace();
      }
           }
    void read(){
    	try{
    f= new File("abc.txt");
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
	
    class mainfile{
    public static void main(String args[]){
    program f1=new program();
    f1.write();
    f1.read();
    }
    }