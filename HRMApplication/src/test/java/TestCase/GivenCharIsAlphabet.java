package TestCase;

public class GivenCharIsAlphabet {

	public static void main(String[] args) 
	{
		char ch='a';
		if(ch>='A'&& ch<='Z'||ch>='a'&&ch<='z')
		{
			System.out.println("alphabet="+ch);
		}
		System.out.println("not a alphabet");

	}

}
