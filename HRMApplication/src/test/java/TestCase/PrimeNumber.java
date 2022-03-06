package TestCase;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int a=17,count=0;
		for(int i=2;i<=a-1;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("a is not a prime number");
		}
		else {
			System.out.println("a is prime number");
		}

	}

}
