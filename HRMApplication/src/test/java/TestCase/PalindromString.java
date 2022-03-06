package TestCase;

public class PalindromString {

	public static void main(String[] args) 
	{
		String s="india";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}

	}

}
