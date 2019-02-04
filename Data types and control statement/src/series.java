import java.util.*;
class series
{
	public static void main(String args[])
	{
		int x,n,i,j,k,num=1,sum,series,din=1,series=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x");
        x=sc.nextInt();
        System.out.println("enter the no. of terms");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
            int num=1;
        	for(j=1;j<=i;j++)
        	{
        		num=num*x;
        	}
        	din=1;
        	 for(k=1;k<=i;k++)
        {
        	din=din*k;
        }
        sum=num/din;
        series=series+sum;
    }
	System.out.println("series"+series);
}
}