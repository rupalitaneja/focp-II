class Employee1{
	String name;
	String address;
	Double salary;
	int yoj;
	Employee1(String nm,int y,String add,Double sal){
	this.name=nm;
	this.address=add;
	this.yoj=y;
	this.salary=sal;
	}
	Employee1(){
	name="Ram";
	address="64C Vasant Kunj";
	yoj=1994;
	}
	void display(){
	System.out.prinntln(name +"\t"+yoj+"\t"+address);
	}
}
 class mainemp{
 public static void main(String args[]){
 String Name,Address;
 int year,i,j=0;
 Double Salary;
 Scanner in=new Scanner(System.in);
 System.out.println("Enter the number of employees:");
 int c=in.nextInt();
 Employee1 e[]=new Employee1[c];
 for(i=0;i<c;i++)
 {
 System.out.println("Enter the employee name:");
 Name=in.next();
 System.out.println("Enter the year of joining:");
 year=in.nextInt();
 System.out.println("Enter the address:");
 in.nextLine();

 Address=in.nextLine();
 System.out.println("Enter the salary:");
 Salary=in.nextDouble();
  e[i]=new Employee1(Name,year,Address,Salary);
}
System.out.println("NAME \t YEAR \t ADDRESS");
 for(i=0;i<c;i++)
 {
 e[i].display();
 }

 }
 }
 