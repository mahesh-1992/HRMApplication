package TestCase;

public class EvenNumber {

	public static void main(String[] args) 
	{
		int count=0;
		for(int i=0;i<=10;i++)
		{
			
			if(i%2==1)
			{
				System.out.println("odd number="+i);
				count++;
			}
		}
		System.out.println("total odd number="+count);
	}

}
