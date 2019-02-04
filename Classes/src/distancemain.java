import java.util.*;
class distancemain{
	public static void main(String args[]){
	float feet1,feet2,inches1,inches2;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter distance in feet:");
	feet1=in.nextInt();
	System.out.println("Enter distance in inches:");
	inches1=in.nextInt();	
	System.out.println("Enter distance in feet:");
	feet2=in.nextInt();
    System.out.println("Enter distance in inches:");
    inches2=in.nextInt();
    distance d2 = new distance();
    distance d1= new distance(feet1,inches1);
    
    distance d3=new distance(feet2,inches2);

    d2=d3.add(d2);
    d2=d1.add(d2);
    System.out.println(d2.dfeet+"  "+d2.dinches);
	}
}