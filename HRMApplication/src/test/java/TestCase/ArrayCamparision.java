package TestCase;

public class ArrayCamparision {

	public static void main(String[] args)
	{
		int[] a= {4,5,3,6,3,5};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
