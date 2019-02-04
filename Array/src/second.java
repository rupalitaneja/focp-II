import java.util.*;

class second
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,n,sum=0,ln,sn,sln,cnt=0,suma=0,j,k;
		int arry[]= new int[5];
		int fre[]= {0,0,0,0,0};
		System.out.println("Enter 5 integer nos.");
		for(i=0;i<5;i++)
		{
			arry[i]= in.nextInt();
		}
		ln=arry[0];
		for(i=1;i<5;i++)
			{
				if(arry[i]>ln)
				{
					ln=arry[i];
				}
			}
		sn=arry[0];
		for(i=1;i<5;i++)
			{
				if(arry[i]<sn)
				{
					sn=arry[i];
				}
			}
		sln=arry[0];
		for(i=1;i<5;i++)
			{
				if(arry[i]>sln && arry[i]!=ln)
				{
					sln=arry[i];
				}
			}
		do
		{	
			System.out.println(" Press 1 for viewing elements \n Press 2 for viewing the sum of all elements \n Press 3 for viewing the largest no. in the arryay \n Press 4 for viewing the smallest no. in the arryay \n Press 5 for viewing the second largest no. in the arryay \n Press 6 for viewing the sum of alternate no. \n Press 7 for viewing the count of even numbers in the arryay\n Press 8 for viewing the occurrence of a given number in the arryay and its frequency");
		    n = in.nextInt();
			switch(n)
			{
				case 1:{
							for(i=0;i<5;i++)
							{
								System.out.println(arry[i]);
							}
							break;
						}
				case 2:{
							for(i=0;i<5;i++)
							{
								sum = sum+arry[i];
							}
							System.out.println("Sum of all nos. is " +sum);
							break;
						}
				case 3:{
							System.out.println("Largest no is " +ln );
							break;
						}
				case 4:{
							System.out.println("Smallest no is " +sn );
							break;
						}
				case 5:{
							System.out.println("Second largest no is " +sln );
							break;
						}
				case 6:{
							for(i=0;i<5;i=i+2)
							{
								suma = suma+arry[i];
							}
							System.out.println("Sum of alternate nos. is " +suma);
							break;
						}		
				case 7:{
							for(i=0;i<5;i++)
							{
								if(arry[i]%2==00)
								{
									cnt++;
								}
							}
							System.out.println("Count of even nos. is " +cnt);
							break;
						}
				case 8:{
							for(i=0;i<5;i++)
							{
								for(j=0;j<5;j++)
								{
									if(arry[i]==arry[j])
									{
										fre[i]++;
									}
								}
							}
							for(i=0;i<5;i++)
							{
								if(i!=0)
								{
									for(j=0;j<i;j++)
									{	
										if(arry[j]==arry[i])
											break;
										else
										{	
											System.out.println("Frequency of " + arry[i] +" is " +fre[i]);
											break;
										}
									}
								}
								else
									System.out.println("Frequency of " + arry[i] +" is " +fre[i]);
							}
							break;
						}
			}
			System.out.println("Press 1 to try again");
			k= in.nextInt();
		}
		while(k==1);
	}
}