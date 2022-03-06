package TestCase;

public class ParentClass
{
	public static void setUp()
	{
		System.out.println("setup method is passed");
	}
	public final void crow()
	{
		System.out.println("crow is black");
	}
	private void cat()
	{
		System.out.println("cat is white");
	}

}
