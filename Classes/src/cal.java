import java.util.*;
class Date{
	int year;
	int month;
	int day;
	Date(int m,int d,int y){
	month=m;
	day=d;
	year=y;
	}
	Date(){
	year=1;
	month=1;
	day=2000;
          }
       void display(){
       System.out.println("Date:"+month+"/"+day+"/"+year);
       }
}
class datemain{
	public static void main(String args[]){
	Scanner in= new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter month:");
	a=in.nextInt();
	System.out.println("Enter date:");
	b=in.nextInt();
	System.out.println("Enter year:");
	c=in.nextInt();
	Date d1= new Date(a,b,c);
	d1.display();
     Date d2=new Date();
     d2.display();
	}
}