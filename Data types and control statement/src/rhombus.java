import java.util.*;
class rhombus
{
	public static void main(String args[])
	{
		int n, i, k, count=1, j,count2=1;
		char ch='A';
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows : ");
		n = scan.nextInt();
		
		for(i=0;i<(n*2);i++)
		{
			for(k=n-count2; k>0; k--)
			{
				System.out.print(" ");
			}
            if(i<n)
            	count2++;
            else
            	count2--;
			for(j=0;j<=count;j++)
			{
				 System.out.print(ch);
				 if(j<count)
				 	ch++;
				 else
				 	ch--;
                 
			}
			if(i<n)
				count=count+2;
			else
				count=count-2;
			ch='A';
			System.out.println();
		}

	}
}