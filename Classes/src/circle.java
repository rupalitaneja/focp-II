import java.util.*;
class circle{
	int r;
	circle(int x)
	{
	r=x;
	}
	circle()
	{
	r=1;
	}
	double area()
	{
	return 3.14*r*r;
	}
	double circumference(){
    return 2*3.14*r;
	}
	void display(){
	double d,c;
	d=this.area();
	c=this.circumference();
	System.out.println("Area is:"+d);
	System.out.println("Circumference is:"+c);
	}
}
class circlemain{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int radius;
	System.out.println("enter the radius");
	radius=in.nextInt();
	circle c1=new circle(radius);
	c1.display();
	circle c2=new circle();
	c2.display();
	}
}