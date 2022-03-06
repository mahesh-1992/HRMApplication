package TestCase;

public class ForLoop {

	public static void main(String[] args)
	{
		int[][]a= {{10,20,30},{40,50}};
		
		//with the help of for loop
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		System.out.println("===========================");
		//with the help of for each loop
		for(int[] x:a)
		{
			for(int y:x)
			{
				System.out.println(y);
			}
		}
		System.out.println("===========================");
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("===========================");
		int x=2;
		for(int i=1;i<10;i++)
		{
			if(i%x==0)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
