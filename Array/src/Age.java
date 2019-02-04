import java.util.* ;
class Age{
	public static void main (String[] args)
	{
	float amount = 1000 ;
	Scanner in = new Scanner (System.in) ;
	System.out.println(" PLEASE ENTER AGE :");
	int i = in.nextInt () ;
	float amt = 0 ;
	if ( i <= 3){
	System.out.println("AMOUNT :" + amt);
}
	else if (i <=12 && i > 3)
	{
	amt = (50*amount)/100 ;
	System.out.println("Amount :"+amt);
		}
		else if ( i<= 65 && i > 12)
		{
		amt = amount ;
		System.out.println ("Amount" + amt );

		}
		else{
			amt = (65*amount)/100 ;
		System.out.println("Amount"+ amt);}

	}
}
