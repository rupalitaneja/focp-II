/*a file contain 10 numbers
read the noss in an array
sort the numberswrite sorted list in the same file*/
import java.util.*;
import java.io.*;
class list{
	 File f=null;
	 int[] N;
	 void numfileread(){
	 try{
	 f= new File("num.txt");
	 FileReader fin=new FileReader(f);
	 BufferedReader bin = new BufferedReader(fin);
	 for(int i=0;i<10;i++){
	 N[i]=Integer.parseInt(bin.readLine());
	 }
	 }
	 catch(Exception e){}
	 for(int i=0;i<10;i++)
	 {
	 System.out.println(N[i]+" ");
	 }
	 }
	 void listsort(){
	 	for(int i=0;i<10;i++){
	 		for(int j=0;j<10;j++){
	 			if(N[i]>N[j]){
	 				int t=N[i];
	 				N[i]=N[j];
	 				N[j]=t;
	 			}
	 		}
	 	}
	 }
	 }
	 class mainlist{
	 public static void main(String args[]){
	 list l1=new list();
	 l1.numfileread();
	 }
	 }
