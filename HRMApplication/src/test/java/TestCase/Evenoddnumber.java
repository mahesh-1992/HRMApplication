package TestCase;

public class Evenoddnumber {

	public static void main(String[] args)
	{
		int count=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
			{
				count++;
				System.out.println("odd no="+i);
			}
		
		}
		System.out.println("total odd nocount="+count);
	}

}
