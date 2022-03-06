package TestCase;

public class PalindromNumber {

	public static void main(String[] args) 
	{
		int n=121,rem,sum=0;
		int t=n;
	   while(n>0)
	   {
		   rem=n%10;
		   sum=sum*10+rem;
		   n=n/10;
	   }
	   System.out.println(sum);
	   if(t==sum)
	   {
		   System.out.println("palindrome number");
	   }
	   else
	   {
		   System.out.println("not palindrome number");
	   }
	}

}
