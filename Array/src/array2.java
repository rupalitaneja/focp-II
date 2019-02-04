import java.util.*;
class array2
{
	public static void main(String args[])
	{
	Scanner arr = new Scanner(System.in);
	int i,j,k=0;
	int arry[][]=new int[5][5];
	System.out.println("enter two digits values :");
	for(i=0;i<5;i++)
	{
	for(j=0;j<5;j++)
	{
	do
      {   
      	if(k>=1)
      		System.out.println("enter the value again:");

	   arry[i][j]= arr.nextInt();
	   k++;
  	  }while(arry[i][j]>99);
  	    k=0;
  	}
   	}
       System.out.println("the array is:");
       for(i=0;i<5;i++)
       {
       	for(j=0;j<5;j++)
       	{
       		System.out.print(arry[i][j]+" ");
       	}
       	System.out.println();
       	
       }

       for(i=0;i<5;i++)
       {
       	for(j=0;j<5;j++)

       {
         if(arry[i][j]%2==0)
         	continue;

         else
        {
          arry[i][j]=arry[i][j]*2;
         }
         
       }
	   }

     System.out.println("the array after multiplying is :")
	 for(i=0;i<5;i++)
	 {
	 	for(j=0;j<5;j++)
	 	{
	 		System.out.print(arry[i][j]+" ");
	 	}   System.out.println();
	 }

}
}