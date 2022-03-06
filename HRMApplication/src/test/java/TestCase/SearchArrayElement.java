package TestCase;

public class SearchArrayElement {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arrayElement= {5,2,3,7,8};
		int searchEement=9;
		for(int i=0;i<arrayElement.length;i++)
		{
			if(arrayElement[i]==searchEement)
			{
				System.out.println("search element="+arrayElement[i]);
			}
			else
			{
				System.out.println("element is not present in arrayElement");
			}
		}
		

	}

}
