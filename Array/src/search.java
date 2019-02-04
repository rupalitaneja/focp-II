import java.util.*;
class search{
	public static void main(String[] args)
	{
		Scanner sear = new Scanner(System.in);
		System.out.println("enter the values of array:");
        int arr[]= new int[5];
		int i,j,k=0;
		for(i=0;i<5;i++)
		{
         arr[i]=sear.nextInt();
		}

		System.out.println("enter the value to serach:");
		j=sear.nextInt();
		for(i=0;i<5;i++)
		{
			if(arr[i]==j)
			{
				System.out.println("the index of searched number is:"+i);
			k++;
		    }
		}    if (k==0)
			System.out.println("index of searched no is -1");
	}
}