package TestCase;

public class VoweLInString {

	public static void main(String[] args) 
	{
		String str="india";
		vowels(str);

	}
   static void vowels(String s)
	{
		char ch;
		int count=0;
		for(int j=0;j<s.length();j++)
		{
			ch=s.charAt(j);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				System.out.println(ch);
			}
		}
		if(count==0)
		{
			System.out.println("no vowel in string");
		}
	}

}
